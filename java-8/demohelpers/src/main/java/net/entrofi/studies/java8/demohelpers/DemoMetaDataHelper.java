package net.entrofi.studies.java8.demohelpers;


import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.maxBy;

public final class DemoMetaDataHelper {
    private static final String TAB = "    ";

    private DemoMetaDataHelper() {
    }

    public static void printMessage(String message) {
        printMessage(message, null);
    }

    public static void printMessage(String message, String decorator) {
        if (StringUtils.isEmpty(decorator)) {
            System.out.print(message);
        } else {
            message = replaceTabs(message) + TAB;
            String headerFooter = headerFooterBuilder(message.length(), decorator);
            System.out.println(headerFooter + message + headerFooter);
        }
    }

    public static void addTitle(String title) {
        title = replaceTabs(title);
        String stars = headFooterBuilder((title + TAB).length());
        System.out.println(stars + title + stars);
    }

    private static String replaceTabs(String title) {
        title = TAB + title.replaceAll("\t", TAB);
        return title;
    }

    public static <T> void printList(String message, List<T> elements) {
        printList(message, elements, "\n", "*");
    }

    public static <T> void printList(String message, List<T> elements, String delimiter, String decorator) {
        StringBuilder builder = new StringBuilder();
        String[] lines = message.replaceAll("\t", TAB).split("\n");
        final String startOfLine = decorator != null ? decorator + " " : " ";
        final String endOfLine =  decorator != null ? decorator + "\n" : "\n";
        final String midLine = decorator != null ? " " + decorator : " ";
        int maxLineLength = Arrays.stream(lines)
                    .collect(maxBy(Comparator.comparingInt(s -> s.length())))
                    .get()
                    .length() + startOfLine.length() + endOfLine.length();
        int spaceCorrectionBound = startOfLine.length() + endOfLine.length() - 2 * decorator.length();

        for (int i = 0; i < lines.length; i++) {
            lines[i] = appendSpaces(lines[i], maxLineLength * decorator.length() + spaceCorrectionBound);
            lines[i] = i < lines.length - 1 ? lines[i] + endOfLine : lines[i] + midLine;
            lines[i] = startOfLine + lines[i];
            builder.append(lines[i]);
        }
        String headerFooter = headerFooterBuilder(maxLineLength, decorator);
        message = builder.toString();
        builder.setLength(0);
        builder.append(headerFooter)
                    .append(message)
                    .append(headerFooter);

        String listStr = elements.stream()
                    .map(e -> e.toString())
                    .collect(Collectors.joining(delimiter));
        builder.append(listStr);
        System.out.print(builder.toString());
    }

    private static String headerFooterBuilder(int length, String decorator) {
        decorator = decorator != null ? decorator : "*";
        StringBuilder starBuilder = new StringBuilder();
        starBuilder.append("\n");
        for (int i = 0; i <= length + 3; i++) {
            starBuilder.append(decorator);
        }
        starBuilder.append("\n");
        return starBuilder.toString();
    }

    private static String headFooterBuilder(int maxLineLength) {
        return headerFooterBuilder(maxLineLength, null);
    }

    private static String appendSpaces(String input, int lineLength) {
        String suffix = Stream.generate(new Supplier<String>() {
            @Override
            public String get() {
                return " ";
            } }).limit(lineLength - input.length()).collect(Collectors.joining());

        return input + suffix;
    }
}
