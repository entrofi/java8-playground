package net.entrofi.studies.java8.demohelpers.sampledatahelpers;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * @author Hasan COMAK
 */
public final class AirportTuple {

    static final List<String> AIRPORT_LIST = new ArrayList<>();

    static {
        AIRPORT_LIST.add("ESB");
        AIRPORT_LIST.add("IST");
        AIRPORT_LIST.add("SAW");
        AIRPORT_LIST.add("AAA");
        AIRPORT_LIST.add("AAB");
        AIRPORT_LIST.add("AAC");
        AIRPORT_LIST.add("AAD");
        AIRPORT_LIST.add("AAE");
        AIRPORT_LIST.add("AAF");
        AIRPORT_LIST.add("AAG");
        AIRPORT_LIST.add("AAH");
        AIRPORT_LIST.add("AAI");
        AIRPORT_LIST.add("AAJ");
        AIRPORT_LIST.add("AAK");
        AIRPORT_LIST.add("AAL");
        AIRPORT_LIST.add("AAM");
        AIRPORT_LIST.add("AAN");
        AIRPORT_LIST.add("AAO");
        AIRPORT_LIST.add("AAQ");
        AIRPORT_LIST.add("AAR");
        AIRPORT_LIST.add("AAS");
        AIRPORT_LIST.add("AAT");
        AIRPORT_LIST.add("AAU");
        AIRPORT_LIST.add("AAV");
        AIRPORT_LIST.add("AAX");
        AIRPORT_LIST.add("AAY");
        AIRPORT_LIST.add("AAZ");
        AIRPORT_LIST.add("ABA");
        AIRPORT_LIST.add("ABB");
        AIRPORT_LIST.add("ABC");
        AIRPORT_LIST.add("ABD");
        AIRPORT_LIST.add("ABE");
        AIRPORT_LIST.add("ABF");
        AIRPORT_LIST.add("ABH");
        AIRPORT_LIST.add("ABI");
        AIRPORT_LIST.add("ABK");
        AIRPORT_LIST.add("ABL");
        AIRPORT_LIST.add("ABM");
        AIRPORT_LIST.add("ABN");
        AIRPORT_LIST.add("ABO");
        AIRPORT_LIST.add("ABP");
        AIRPORT_LIST.add("ABQ");
        AIRPORT_LIST.add("ABR");
        AIRPORT_LIST.add("ABS");
        AIRPORT_LIST.add("ABT");
        AIRPORT_LIST.add("ABU");
        AIRPORT_LIST.add("ABV");
        AIRPORT_LIST.add("ABW");
        AIRPORT_LIST.add("ABX");
        AIRPORT_LIST.add("ABY");
        AIRPORT_LIST.add("ABZ");
        AIRPORT_LIST.add("ACA");
        AIRPORT_LIST.add("ACB");
        AIRPORT_LIST.add("ACC");
        AIRPORT_LIST.add("ACD");
        AIRPORT_LIST.add("ACE");
        AIRPORT_LIST.add("ACH");
        AIRPORT_LIST.add("ACI");
        AIRPORT_LIST.add("ACJ");
        AIRPORT_LIST.add("ACK");
        AIRPORT_LIST.add("ACL");
        AIRPORT_LIST.add("ACM");
        AIRPORT_LIST.add("ACN");
        AIRPORT_LIST.add("ACP");
        AIRPORT_LIST.add("ACR");
        AIRPORT_LIST.add("ACS");
        AIRPORT_LIST.add("ACT");
        AIRPORT_LIST.add("ACU");
        AIRPORT_LIST.add("ACV");
        AIRPORT_LIST.add("ACY");
        AIRPORT_LIST.add("ACZ");
        AIRPORT_LIST.add("ADA");
        AIRPORT_LIST.add("ADB");
        AIRPORT_LIST.add("ADC");
        AIRPORT_LIST.add("ADD");
        AIRPORT_LIST.add("ADE");
        AIRPORT_LIST.add("ADF");
        AIRPORT_LIST.add("ADG");
        AIRPORT_LIST.add("ADH");
        AIRPORT_LIST.add("ADI");
        AIRPORT_LIST.add("ADJ");
        AIRPORT_LIST.add("ADK");
        AIRPORT_LIST.add("ADL");
        AIRPORT_LIST.add("ADM");
        AIRPORT_LIST.add("ADN");
        AIRPORT_LIST.add("ADO");
        AIRPORT_LIST.add("ADP");
        AIRPORT_LIST.add("ADQ");
        AIRPORT_LIST.add("ADR");
        AIRPORT_LIST.add("ADS");
        AIRPORT_LIST.add("ADT");
        AIRPORT_LIST.add("ADU");
        AIRPORT_LIST.add("ADV");
        AIRPORT_LIST.add("ADW");
        AIRPORT_LIST.add("ADX");
        AIRPORT_LIST.add("ADY");
        AIRPORT_LIST.add("ADZ");
        AIRPORT_LIST.add("AEA");
        AIRPORT_LIST.add("AEB");
        AIRPORT_LIST.add("AEE");
        AIRPORT_LIST.add("AEG");
        AIRPORT_LIST.add("AEH");
        AIRPORT_LIST.add("AEK");
        AIRPORT_LIST.add("AEL");
        AIRPORT_LIST.add("AEO");
        AIRPORT_LIST.add("AEP");
        AIRPORT_LIST.add("AER");
        AIRPORT_LIST.add("AES");
        AIRPORT_LIST.add("AET");
        AIRPORT_LIST.add("AEU");
        AIRPORT_LIST.add("AEX");
        AIRPORT_LIST.add("AEY");
        AIRPORT_LIST.add("AFA");
        AIRPORT_LIST.add("AFD");
        AIRPORT_LIST.add("AFF");
        AIRPORT_LIST.add("AFI");
        AIRPORT_LIST.add("AFK");
        AIRPORT_LIST.add("AFL");
        AIRPORT_LIST.add("AFN");
        AIRPORT_LIST.add("AFO");
        AIRPORT_LIST.add("AFR");
        AIRPORT_LIST.add("AFS");
        AIRPORT_LIST.add("AFT");
        AIRPORT_LIST.add("AFW");
        AIRPORT_LIST.add("AFY");
        AIRPORT_LIST.add("AFZ");
        AIRPORT_LIST.add("AGA");
        AIRPORT_LIST.add("AGB");
        AIRPORT_LIST.add("AGC");
        AIRPORT_LIST.add("AGD");
        AIRPORT_LIST.add("AGE");
        AIRPORT_LIST.add("AGF");
        AIRPORT_LIST.add("AGG");
        AIRPORT_LIST.add("AGH");
        AIRPORT_LIST.add("AGI");
        AIRPORT_LIST.add("AGJ");
        AIRPORT_LIST.add("AGK");
        AIRPORT_LIST.add("AGL");
        AIRPORT_LIST.add("AGN");
        AIRPORT_LIST.add("AGO");
        AIRPORT_LIST.add("AGP");
        AIRPORT_LIST.add("AGQ");
        AIRPORT_LIST.add("AGR");
        AIRPORT_LIST.add("AGS");
        AIRPORT_LIST.add("AGT");
        AIRPORT_LIST.add("AGU");
        AIRPORT_LIST.add("AGV");
        AIRPORT_LIST.add("AGW");
        AIRPORT_LIST.add("AGX");
        AIRPORT_LIST.add("AGZ");
        AIRPORT_LIST.add("AHB");
        AIRPORT_LIST.add("AHC");
        AIRPORT_LIST.add("AHD");
        AIRPORT_LIST.add("AHE");
        AIRPORT_LIST.add("AHF");
        AIRPORT_LIST.add("AHH");
        AIRPORT_LIST.add("AHI");
        AIRPORT_LIST.add("AHJ");
        AIRPORT_LIST.add("AHL");
        AIRPORT_LIST.add("AHM");
        AIRPORT_LIST.add("AHN");
        AIRPORT_LIST.add("AHO");
        AIRPORT_LIST.add("AHS");
        AIRPORT_LIST.add("AHU");
        AIRPORT_LIST.add("AHW");
        AIRPORT_LIST.add("AHY");
        AIRPORT_LIST.add("AHZ");
        AIRPORT_LIST.add("AIA");
        AIRPORT_LIST.add("AIC");
        AIRPORT_LIST.add("AID");
        AIRPORT_LIST.add("AIE");
        AIRPORT_LIST.add("AIF");
        AIRPORT_LIST.add("AIG");
        AIRPORT_LIST.add("AIH");
        AIRPORT_LIST.add("AII");
        AIRPORT_LIST.add("AIK");
        AIRPORT_LIST.add("AIL");
        AIRPORT_LIST.add("AIM");
        AIRPORT_LIST.add("AIN");
        AIRPORT_LIST.add("AIO");
        AIRPORT_LIST.add("AIR");
        AIRPORT_LIST.add("AIS");
        AIRPORT_LIST.add("AIT");
        AIRPORT_LIST.add("AIU");
        AIRPORT_LIST.add("AIV");
        AIRPORT_LIST.add("AIW");
        AIRPORT_LIST.add("AIZ");
        AIRPORT_LIST.add("AJA");
        AIRPORT_LIST.add("AJI");
        AIRPORT_LIST.add("AJJ");
        AIRPORT_LIST.add("AJK");
        AIRPORT_LIST.add("AJL");
        AIRPORT_LIST.add("AJN");
        AIRPORT_LIST.add("AJR");
        AIRPORT_LIST.add("AJS");
        AIRPORT_LIST.add("AJU");
        AIRPORT_LIST.add("AJY");
        AIRPORT_LIST.add("AKA");
        AIRPORT_LIST.add("AKB");
        AIRPORT_LIST.add("AKC");
        AIRPORT_LIST.add("AKD");
        AIRPORT_LIST.add("AKE");
        AIRPORT_LIST.add("AKF");
        AIRPORT_LIST.add("AKG");
        AIRPORT_LIST.add("AKH");
        AIRPORT_LIST.add("AKI");
        AIRPORT_LIST.add("AKJ");
        AIRPORT_LIST.add("AKK");
        AIRPORT_LIST.add("AKL");
        AIRPORT_LIST.add("AKM");
        AIRPORT_LIST.add("AKN");
        AIRPORT_LIST.add("AKO");
        AIRPORT_LIST.add("AKP");
        AIRPORT_LIST.add("AKQ");
        AIRPORT_LIST.add("AKR");
        AIRPORT_LIST.add("AKS");
        AIRPORT_LIST.add("AKT");
        AIRPORT_LIST.add("AKU");
        AIRPORT_LIST.add("AKV");
        AIRPORT_LIST.add("AKW");
        AIRPORT_LIST.add("AKX");
        AIRPORT_LIST.add("AKY");
        AIRPORT_LIST.add("ALA");
        AIRPORT_LIST.add("ALB");
        AIRPORT_LIST.add("ALC");
        AIRPORT_LIST.add("ALD");
        AIRPORT_LIST.add("ALE");
        AIRPORT_LIST.add("ALF");
        AIRPORT_LIST.add("ALG");
        AIRPORT_LIST.add("ALH");
        AIRPORT_LIST.add("ALI");
        AIRPORT_LIST.add("ALJ");
        AIRPORT_LIST.add("ALK");
        AIRPORT_LIST.add("ALL");
        AIRPORT_LIST.add("ALM");
        AIRPORT_LIST.add("ALN");
        AIRPORT_LIST.add("ALO");
        AIRPORT_LIST.add("ALP");
        AIRPORT_LIST.add("ALQ");
        AIRPORT_LIST.add("ALR");
        AIRPORT_LIST.add("ALS");
        AIRPORT_LIST.add("ALT");
        AIRPORT_LIST.add("ALU");
        AIRPORT_LIST.add("ALW");
        AIRPORT_LIST.add("ALX");
        AIRPORT_LIST.add("ALY");
        AIRPORT_LIST.add("ALZ");
        AIRPORT_LIST.add("AMA");
        AIRPORT_LIST.add("AMB");
        AIRPORT_LIST.add("AMC");
        AIRPORT_LIST.add("AMD");
        AIRPORT_LIST.add("AME");
        AIRPORT_LIST.add("AMF");
        AIRPORT_LIST.add("AMG");
        AIRPORT_LIST.add("AMH");
        AIRPORT_LIST.add("AMI");
        AIRPORT_LIST.add("AMJ");
        AIRPORT_LIST.add("AMK");
        AIRPORT_LIST.add("AML");
        AIRPORT_LIST.add("AMM");
        AIRPORT_LIST.add("AMN");
        AIRPORT_LIST.add("AMO");
        AIRPORT_LIST.add("AMP");
        AIRPORT_LIST.add("AMQ");
        AIRPORT_LIST.add("AMS");
        AIRPORT_LIST.add("AMT");
        AIRPORT_LIST.add("AMU");
        AIRPORT_LIST.add("AMV");
        AIRPORT_LIST.add("AMW");
        AIRPORT_LIST.add("AMX");
        AIRPORT_LIST.add("AMY");
        AIRPORT_LIST.add("AMZ");
        AIRPORT_LIST.add("ANA");
        AIRPORT_LIST.add("ANB");
        AIRPORT_LIST.add("ANC");
        AIRPORT_LIST.add("AND");
        AIRPORT_LIST.add("ANE");
        AIRPORT_LIST.add("ANF");
        AIRPORT_LIST.add("ANG");
        AIRPORT_LIST.add("ANI");
        AIRPORT_LIST.add("ANK");
        AIRPORT_LIST.add("ANL");
        AIRPORT_LIST.add("ANM");
        AIRPORT_LIST.add("ANN");
        AIRPORT_LIST.add("ANO");
        AIRPORT_LIST.add("ANP");
        AIRPORT_LIST.add("ANQ");
        AIRPORT_LIST.add("ANR");
        AIRPORT_LIST.add("ANS");
        AIRPORT_LIST.add("ANU");
        AIRPORT_LIST.add("ANV");
        AIRPORT_LIST.add("ANW");
        AIRPORT_LIST.add("ANX");
        AIRPORT_LIST.add("ANY");
        AIRPORT_LIST.add("ANZ");
        AIRPORT_LIST.add("AOA");
        AIRPORT_LIST.add("AOB");
        AIRPORT_LIST.add("AOC");
        AIRPORT_LIST.add("AOD");
        AIRPORT_LIST.add("AOE");
        AIRPORT_LIST.add("AOG");
        AIRPORT_LIST.add("AOH");
        AIRPORT_LIST.add("AOI");
        AIRPORT_LIST.add("AOJ");
        AIRPORT_LIST.add("AOK");
        AIRPORT_LIST.add("AOL");
        AIRPORT_LIST.add("AOM");
        AIRPORT_LIST.add("AON");
        AIRPORT_LIST.add("AOO");
        AIRPORT_LIST.add("AOP");
        AIRPORT_LIST.add("AOR");
        AIRPORT_LIST.add("AOS");
        AIRPORT_LIST.add("AOT");
        AIRPORT_LIST.add("AOU");
        AIRPORT_LIST.add("APA");
        AIRPORT_LIST.add("APB");
        AIRPORT_LIST.add("APC");
        AIRPORT_LIST.add("APF");
        AIRPORT_LIST.add("APG");
        AIRPORT_LIST.add("APH");
        AIRPORT_LIST.add("API");
        AIRPORT_LIST.add("APK");
        AIRPORT_LIST.add("APL");
        AIRPORT_LIST.add("APN");
        AIRPORT_LIST.add("APO");
        AIRPORT_LIST.add("APP");
        AIRPORT_LIST.add("APQ");
        AIRPORT_LIST.add("APR");
        AIRPORT_LIST.add("APS");
        AIRPORT_LIST.add("APT");
        AIRPORT_LIST.add("APU");
        AIRPORT_LIST.add("APV");
        AIRPORT_LIST.add("APW");
        AIRPORT_LIST.add("APX");
        AIRPORT_LIST.add("APY");
        AIRPORT_LIST.add("APZ");
        AIRPORT_LIST.add("AQA");
        AIRPORT_LIST.add("AQG");
        AIRPORT_LIST.add("AQI");
        AIRPORT_LIST.add("AQJ");
        AIRPORT_LIST.add("AQM");
        AIRPORT_LIST.add("AQP");
        AIRPORT_LIST.add("AQS");
        AIRPORT_LIST.add("AQY");
        AIRPORT_LIST.add("ARA");
        AIRPORT_LIST.add("ARB");
        AIRPORT_LIST.add("ARC");
        AIRPORT_LIST.add("ARD");
        AIRPORT_LIST.add("ARE");
        AIRPORT_LIST.add("ARF");
        AIRPORT_LIST.add("ARG");
        AIRPORT_LIST.add("ARH");
        AIRPORT_LIST.add("ARI");
        AIRPORT_LIST.add("ARJ");
        AIRPORT_LIST.add("ARL");
        AIRPORT_LIST.add("ARM");
        AIRPORT_LIST.add("ARN");
        AIRPORT_LIST.add("ARO");
        AIRPORT_LIST.add("ARP");
        AIRPORT_LIST.add("ARQ");
        AIRPORT_LIST.add("ARR");
        AIRPORT_LIST.add("ARS");
        AIRPORT_LIST.add("ART");
        AIRPORT_LIST.add("ARU");
        AIRPORT_LIST.add("ARV");
        AIRPORT_LIST.add("ARW");
        AIRPORT_LIST.add("ARY");
        AIRPORT_LIST.add("ASA");
        AIRPORT_LIST.add("ASB");
        AIRPORT_LIST.add("ASC");
        AIRPORT_LIST.add("ASD");
        AIRPORT_LIST.add("ASE");
        AIRPORT_LIST.add("ASF");
        AIRPORT_LIST.add("ASG");
        AIRPORT_LIST.add("ASH");
        AIRPORT_LIST.add("ASI");
        AIRPORT_LIST.add("ASJ");
        AIRPORT_LIST.add("ASL");
        AIRPORT_LIST.add("ASM");
        AIRPORT_LIST.add("ASN");
        AIRPORT_LIST.add("ASO");
        AIRPORT_LIST.add("ASP");
        AIRPORT_LIST.add("ASQ");
        AIRPORT_LIST.add("ASR");
        AIRPORT_LIST.add("ASS");
        AIRPORT_LIST.add("AST");
        AIRPORT_LIST.add("ASU");
        AIRPORT_LIST.add("ASV");
        AIRPORT_LIST.add("ASW");
        AIRPORT_LIST.add("ASX");
        AIRPORT_LIST.add("ASY");
        AIRPORT_LIST.add("ASZ");
        AIRPORT_LIST.add("ATA");
        AIRPORT_LIST.add("ATB");
        AIRPORT_LIST.add("ATC");
        AIRPORT_LIST.add("ATD");
        AIRPORT_LIST.add("ATE");
        AIRPORT_LIST.add("ATF");
        AIRPORT_LIST.add("ATG");
        AIRPORT_LIST.add("ATH");
        AIRPORT_LIST.add("ATI");
        AIRPORT_LIST.add("ATJ");
        AIRPORT_LIST.add("ATK");
        AIRPORT_LIST.add("ATL");
        AIRPORT_LIST.add("ATM");
        AIRPORT_LIST.add("ATN");
        AIRPORT_LIST.add("ATO");
        AIRPORT_LIST.add("ATP");
        AIRPORT_LIST.add("ATQ");
        AIRPORT_LIST.add("ATR");
        AIRPORT_LIST.add("ATS");
        AIRPORT_LIST.add("ATT");
        AIRPORT_LIST.add("ATU");
        AIRPORT_LIST.add("ATV");
        AIRPORT_LIST.add("ATW");
        AIRPORT_LIST.add("ATX");
        AIRPORT_LIST.add("ATY");
        AIRPORT_LIST.add("ATZ");
        AIRPORT_LIST.add("AUC");
        AIRPORT_LIST.add("AUD");
        AIRPORT_LIST.add("AUE");
        AIRPORT_LIST.add("AUF");
        AIRPORT_LIST.add("AUG");
        AIRPORT_LIST.add("AUH");
        AIRPORT_LIST.add("AUI");
        AIRPORT_LIST.add("AUJ");
        AIRPORT_LIST.add("AUK");
        AIRPORT_LIST.add("AUL");
        AIRPORT_LIST.add("AUM");
        AIRPORT_LIST.add("AUN");
        AIRPORT_LIST.add("AUO");
        AIRPORT_LIST.add("AUP");
        AIRPORT_LIST.add("AUQ");
        AIRPORT_LIST.add("AUR");
        AIRPORT_LIST.add("AUS");
        AIRPORT_LIST.add("AUT");
        AIRPORT_LIST.add("AUU");
        AIRPORT_LIST.add("AUV");
        AIRPORT_LIST.add("AUW");
        AIRPORT_LIST.add("AUX");
        AIRPORT_LIST.add("AUY");
        AIRPORT_LIST.add("AUZ");
        AIRPORT_LIST.add("AVA");
        AIRPORT_LIST.add("AVB");
        AIRPORT_LIST.add("AVG");
        AIRPORT_LIST.add("AVI");
        AIRPORT_LIST.add("AVK");
        AIRPORT_LIST.add("AVL");
        AIRPORT_LIST.add("AVN");
        AIRPORT_LIST.add("AVO");
        AIRPORT_LIST.add("AVP");
        AIRPORT_LIST.add("AVR");
        AIRPORT_LIST.add("AVU");
        AIRPORT_LIST.add("AVV");
        AIRPORT_LIST.add("AVW");
        AIRPORT_LIST.add("AVX");
        AIRPORT_LIST.add("AWA");
        AIRPORT_LIST.add("AWB");
        AIRPORT_LIST.add("AWD");
        AIRPORT_LIST.add("AWE");
        AIRPORT_LIST.add("AWK");
        AIRPORT_LIST.add("AWM");
        AIRPORT_LIST.add("AWN");
        AIRPORT_LIST.add("AWP");
        AIRPORT_LIST.add("AWR");
        AIRPORT_LIST.add("AWZ");
        AIRPORT_LIST.add("AXA");
        AIRPORT_LIST.add("AXB");
        AIRPORT_LIST.add("AXC");
        AIRPORT_LIST.add("AXD");
        AIRPORT_LIST.add("AXE");
        AIRPORT_LIST.add("AXF");
        AIRPORT_LIST.add("AXG");
        AIRPORT_LIST.add("AXJ");
        AIRPORT_LIST.add("AXK");
        AIRPORT_LIST.add("AXL");
        AIRPORT_LIST.add("AXM");
        AIRPORT_LIST.add("AXN");
        AIRPORT_LIST.add("AXR");
        AIRPORT_LIST.add("AXS");
        AIRPORT_LIST.add("AXT");
        AIRPORT_LIST.add("AXU");
        AIRPORT_LIST.add("AXV");
        AIRPORT_LIST.add("AXX");
        AIRPORT_LIST.add("AYA");
        AIRPORT_LIST.add("AYC");
        AIRPORT_LIST.add("AYD");
        AIRPORT_LIST.add("AYG");
        AIRPORT_LIST.add("AYI");
        AIRPORT_LIST.add("AYK");
        AIRPORT_LIST.add("AYL");
        AIRPORT_LIST.add("AYM");
        AIRPORT_LIST.add("AYN");
        AIRPORT_LIST.add("AYO");
        AIRPORT_LIST.add("AYP");
        AIRPORT_LIST.add("AYQ");
        AIRPORT_LIST.add("AYR");
        AIRPORT_LIST.add("AYS");
        AIRPORT_LIST.add("AYT");
        AIRPORT_LIST.add("AYU");
        AIRPORT_LIST.add("AYW");
        AIRPORT_LIST.add("AYY");
        AIRPORT_LIST.add("AZA");
        AIRPORT_LIST.add("AZB");
        AIRPORT_LIST.add("AZD");
        AIRPORT_LIST.add("AZG");
        AIRPORT_LIST.add("AZI");
        AIRPORT_LIST.add("AZL");
        AIRPORT_LIST.add("AZN");
        AIRPORT_LIST.add("AZO");
        AIRPORT_LIST.add("AZP");
        AIRPORT_LIST.add("AZR");
        AIRPORT_LIST.add("AZS");
        AIRPORT_LIST.add("AZT");
        AIRPORT_LIST.add("AZZ");
        AIRPORT_LIST.add("BAA");
        AIRPORT_LIST.add("BAB");
        AIRPORT_LIST.add("BAC");
        AIRPORT_LIST.add("BAD");
        AIRPORT_LIST.add("BAE");
        AIRPORT_LIST.add("BAF");
        AIRPORT_LIST.add("BAG");
        AIRPORT_LIST.add("BAH");
        AIRPORT_LIST.add("BAI");
        AIRPORT_LIST.add("BAJ");
        AIRPORT_LIST.add("BAK");
        AIRPORT_LIST.add("BAL");
        AIRPORT_LIST.add("BAM");
        AIRPORT_LIST.add("BAN");
        AIRPORT_LIST.add("BAP");
        AIRPORT_LIST.add("BAQ");
        AIRPORT_LIST.add("BAR");
        AIRPORT_LIST.add("BAS");
        AIRPORT_LIST.add("BAT");
        AIRPORT_LIST.add("BAV");
        AIRPORT_LIST.add("BAW");
        AIRPORT_LIST.add("BAX");
        AIRPORT_LIST.add("BAY");
        AIRPORT_LIST.add("BAZ");
        AIRPORT_LIST.add("BBA");
        AIRPORT_LIST.add("BBB");
        AIRPORT_LIST.add("BBC");
        AIRPORT_LIST.add("BBD");
        AIRPORT_LIST.add("BBG");
        AIRPORT_LIST.add("BBH");
        AIRPORT_LIST.add("BBI");
        AIRPORT_LIST.add("BBJ");
        AIRPORT_LIST.add("BBK");
        AIRPORT_LIST.add("BBL");
        AIRPORT_LIST.add("BBM");
        AIRPORT_LIST.add("BBN");
        AIRPORT_LIST.add("BBO");
        AIRPORT_LIST.add("BBP");
        AIRPORT_LIST.add("BBQ");
        AIRPORT_LIST.add("BBR");
        AIRPORT_LIST.add("BBS");
        AIRPORT_LIST.add("BBT");
        AIRPORT_LIST.add("BBU");
        AIRPORT_LIST.add("BBV");
        AIRPORT_LIST.add("BBW");
        AIRPORT_LIST.add("BBX");
        AIRPORT_LIST.add("BBY");
        AIRPORT_LIST.add("BBZ");
        AIRPORT_LIST.add("BCA");
        AIRPORT_LIST.add("BCB");
        AIRPORT_LIST.add("BCC");
        AIRPORT_LIST.add("BCD");
        AIRPORT_LIST.add("BCE");
        AIRPORT_LIST.add("BCF");
        AIRPORT_LIST.add("BCG");
        AIRPORT_LIST.add("BCH");
        AIRPORT_LIST.add("BCI");
        AIRPORT_LIST.add("BCK");
        AIRPORT_LIST.add("BCL");
        AIRPORT_LIST.add("BCM");
        AIRPORT_LIST.add("BCN");
        AIRPORT_LIST.add("BCO");
        AIRPORT_LIST.add("BCP");
        AIRPORT_LIST.add("BCQ");
        AIRPORT_LIST.add("BCR");
        AIRPORT_LIST.add("BCS");
        AIRPORT_LIST.add("BCT");
        AIRPORT_LIST.add("BCU");
        AIRPORT_LIST.add("BCV");
        AIRPORT_LIST.add("BCW");
        AIRPORT_LIST.add("BCX");
        AIRPORT_LIST.add("BCY");
        AIRPORT_LIST.add("BCZ");
        AIRPORT_LIST.add("BDA");
        AIRPORT_LIST.add("BDB");
        AIRPORT_LIST.add("BDC");
        AIRPORT_LIST.add("BDD");
        AIRPORT_LIST.add("BDE");
        AIRPORT_LIST.add("BDF");
        AIRPORT_LIST.add("BDG");
        AIRPORT_LIST.add("BDH");
        AIRPORT_LIST.add("BDI");
        AIRPORT_LIST.add("BDJ");
        AIRPORT_LIST.add("BDK");
        AIRPORT_LIST.add("BDL");
        AIRPORT_LIST.add("BDM");
        AIRPORT_LIST.add("BDN");
        AIRPORT_LIST.add("BDO");
        AIRPORT_LIST.add("BDP");
        AIRPORT_LIST.add("BDQ");
        AIRPORT_LIST.add("BDR");
        AIRPORT_LIST.add("BDS");
        AIRPORT_LIST.add("BDT");
        AIRPORT_LIST.add("BDU");
        AIRPORT_LIST.add("BDV");
        AIRPORT_LIST.add("BDW");
        AIRPORT_LIST.add("BDX");
        AIRPORT_LIST.add("BDY");
        AIRPORT_LIST.add("BDZ");
        AIRPORT_LIST.add("BEA");
        AIRPORT_LIST.add("BEB");
        AIRPORT_LIST.add("BEC");
        AIRPORT_LIST.add("BED");
        AIRPORT_LIST.add("BEE");
        AIRPORT_LIST.add("BEF");
        AIRPORT_LIST.add("BEG");
        AIRPORT_LIST.add("BEH");
        AIRPORT_LIST.add("BEI");
        AIRPORT_LIST.add("BEJ");
        AIRPORT_LIST.add("BEK");
        AIRPORT_LIST.add("BEL");
        AIRPORT_LIST.add("BEM");
        AIRPORT_LIST.add("BEN");
        AIRPORT_LIST.add("BEO");
        AIRPORT_LIST.add("BEP");
        AIRPORT_LIST.add("BEQ");
        AIRPORT_LIST.add("BER");
        AIRPORT_LIST.add("BES");
        AIRPORT_LIST.add("BET");
        AIRPORT_LIST.add("BEU");
        AIRPORT_LIST.add("BEV");
        AIRPORT_LIST.add("BEW");
        AIRPORT_LIST.add("BEX");
        AIRPORT_LIST.add("BEY");
        AIRPORT_LIST.add("BEZ");
        AIRPORT_LIST.add("BFA");
        AIRPORT_LIST.add("BFC");
        AIRPORT_LIST.add("BFD");
        AIRPORT_LIST.add("BFE");
        AIRPORT_LIST.add("BFF");
        AIRPORT_LIST.add("BFG");
        AIRPORT_LIST.add("BFH");
        AIRPORT_LIST.add("BFI");
        AIRPORT_LIST.add("BFJ");
        AIRPORT_LIST.add("BFK");
        AIRPORT_LIST.add("BFL");
        AIRPORT_LIST.add("BFM");
        AIRPORT_LIST.add("BFN");
        AIRPORT_LIST.add("BFO");
        AIRPORT_LIST.add("BFP");
        AIRPORT_LIST.add("BFQ");
        AIRPORT_LIST.add("BFR");
        AIRPORT_LIST.add("BFS");
        AIRPORT_LIST.add("BFT");
        AIRPORT_LIST.add("BFU");
        AIRPORT_LIST.add("BFV");
        AIRPORT_LIST.add("BFW");
        AIRPORT_LIST.add("BFX");
        AIRPORT_LIST.add("BGA");
        AIRPORT_LIST.add("BGB");
        AIRPORT_LIST.add("BGC");
        AIRPORT_LIST.add("BGD");
        AIRPORT_LIST.add("BGE");
        AIRPORT_LIST.add("BGF");
        AIRPORT_LIST.add("BGG");
        AIRPORT_LIST.add("BGH");
        AIRPORT_LIST.add("BGI");
        AIRPORT_LIST.add("BGJ");
        AIRPORT_LIST.add("BGK");
        AIRPORT_LIST.add("BGL");
        AIRPORT_LIST.add("BGM");
        AIRPORT_LIST.add("BGN");
        AIRPORT_LIST.add("BGO");
        AIRPORT_LIST.add("BGP");
        AIRPORT_LIST.add("BGQ");
        AIRPORT_LIST.add("BGR");
        AIRPORT_LIST.add("BGT");
        AIRPORT_LIST.add("BGU");
        AIRPORT_LIST.add("BGV");
        AIRPORT_LIST.add("BGW");
        AIRPORT_LIST.add("BGX");
        AIRPORT_LIST.add("BGY");
        AIRPORT_LIST.add("BGZ");
        AIRPORT_LIST.add("BHA");
        AIRPORT_LIST.add("BHB");
        AIRPORT_LIST.add("BHD");
        AIRPORT_LIST.add("BHE");
        AIRPORT_LIST.add("BHF");
        AIRPORT_LIST.add("BHG");
        AIRPORT_LIST.add("BHH");
        AIRPORT_LIST.add("BHI");
        AIRPORT_LIST.add("BHJ");
        AIRPORT_LIST.add("BHK");
        AIRPORT_LIST.add("BHL");
        AIRPORT_LIST.add("BHM");
        AIRPORT_LIST.add("BHN");
        AIRPORT_LIST.add("BHO");
        AIRPORT_LIST.add("BHP");
        AIRPORT_LIST.add("BHQ");
        AIRPORT_LIST.add("BHR");
        AIRPORT_LIST.add("BHS");
        AIRPORT_LIST.add("BHT");
        AIRPORT_LIST.add("BHU");
        AIRPORT_LIST.add("BHV");
        AIRPORT_LIST.add("BHW");
        AIRPORT_LIST.add("BHX");
        AIRPORT_LIST.add("BHY");
        AIRPORT_LIST.add("BHZ");
        AIRPORT_LIST.add("BIA");
        AIRPORT_LIST.add("BIB");
        AIRPORT_LIST.add("BID");
        AIRPORT_LIST.add("BIE");
        AIRPORT_LIST.add("BIF");
        AIRPORT_LIST.add("BIG");
        AIRPORT_LIST.add("BIH");
        AIRPORT_LIST.add("BII");
        AIRPORT_LIST.add("BIJ");
        AIRPORT_LIST.add("BIK");
        AIRPORT_LIST.add("BIL");
        AIRPORT_LIST.add("BIM");
        AIRPORT_LIST.add("BIN");
        AIRPORT_LIST.add("BIO");
        AIRPORT_LIST.add("BIP");
        AIRPORT_LIST.add("BIQ");
        AIRPORT_LIST.add("BIR");
        AIRPORT_LIST.add("BIS");
        AIRPORT_LIST.add("BIT");
        AIRPORT_LIST.add("BIU");
        AIRPORT_LIST.add("BIV");
        AIRPORT_LIST.add("BIW");
        AIRPORT_LIST.add("BIX");
        AIRPORT_LIST.add("BIY");
        AIRPORT_LIST.add("BIZ");
        AIRPORT_LIST.add("BJA");
        AIRPORT_LIST.add("BJB");
        AIRPORT_LIST.add("BJC");
        AIRPORT_LIST.add("BJD");
        AIRPORT_LIST.add("BJE");
        AIRPORT_LIST.add("BJF");
        AIRPORT_LIST.add("BJG");
        AIRPORT_LIST.add("BJH");
        AIRPORT_LIST.add("BJI");
        AIRPORT_LIST.add("BJJ");
        AIRPORT_LIST.add("BJK");
        AIRPORT_LIST.add("BJL");
        AIRPORT_LIST.add("BJM");
        AIRPORT_LIST.add("BJN");
        AIRPORT_LIST.add("BJO");
        AIRPORT_LIST.add("BJP");
        AIRPORT_LIST.add("BJQ");
        AIRPORT_LIST.add("BJR");
        AIRPORT_LIST.add("BJS");
        AIRPORT_LIST.add("BJT");
        AIRPORT_LIST.add("BJU");
        AIRPORT_LIST.add("BJV");
        AIRPORT_LIST.add("BJW");
        AIRPORT_LIST.add("BJX");
        AIRPORT_LIST.add("BJY");
        AIRPORT_LIST.add("BJZ");
        AIRPORT_LIST.add("BKB");
        AIRPORT_LIST.add("BKC");
        AIRPORT_LIST.add("BKD");
        AIRPORT_LIST.add("BKE");
        AIRPORT_LIST.add("BKF");
        AIRPORT_LIST.add("BKG");
        AIRPORT_LIST.add("BKH");
        AIRPORT_LIST.add("BKI");
        AIRPORT_LIST.add("BKJ");
        AIRPORT_LIST.add("BKK");
        AIRPORT_LIST.add("BKL");
        AIRPORT_LIST.add("BKM");
        AIRPORT_LIST.add("BKN");
        AIRPORT_LIST.add("BKO");
        AIRPORT_LIST.add("BKP");
        AIRPORT_LIST.add("BKQ");
        AIRPORT_LIST.add("BKR");
        AIRPORT_LIST.add("BKS");
        AIRPORT_LIST.add("BKT");
        AIRPORT_LIST.add("BKU");
        AIRPORT_LIST.add("BKW");
        AIRPORT_LIST.add("BKX");
        AIRPORT_LIST.add("BKY");
        AIRPORT_LIST.add("BKZ");
        AIRPORT_LIST.add("BLA");
        AIRPORT_LIST.add("BLB");
        AIRPORT_LIST.add("BLC");
        AIRPORT_LIST.add("BLD");
        AIRPORT_LIST.add("BLE");
        AIRPORT_LIST.add("BLF");
        AIRPORT_LIST.add("BLG");
        AIRPORT_LIST.add("BLH");
        AIRPORT_LIST.add("BLI");
        AIRPORT_LIST.add("BLJ");
        AIRPORT_LIST.add("BLK");
        AIRPORT_LIST.add("BLL");
        AIRPORT_LIST.add("BLM");
        AIRPORT_LIST.add("BLN");
        AIRPORT_LIST.add("BLO");
        AIRPORT_LIST.add("BLP");
        AIRPORT_LIST.add("BLQ");
        AIRPORT_LIST.add("BLR");
        AIRPORT_LIST.add("BLS");
        AIRPORT_LIST.add("BLT");
        AIRPORT_LIST.add("BLU");
        AIRPORT_LIST.add("BLV");
        AIRPORT_LIST.add("BLW");
        AIRPORT_LIST.add("BLX");
        AIRPORT_LIST.add("BLY");
        AIRPORT_LIST.add("BLZ");
        AIRPORT_LIST.add("BMA");
        AIRPORT_LIST.add("BMB");
        AIRPORT_LIST.add("BMC");
        AIRPORT_LIST.add("BMD");
        AIRPORT_LIST.add("BME");
        AIRPORT_LIST.add("BMF");
        AIRPORT_LIST.add("BMG");
        AIRPORT_LIST.add("BMH");
        AIRPORT_LIST.add("BMI");
        AIRPORT_LIST.add("BMJ");
        AIRPORT_LIST.add("BMK");
        AIRPORT_LIST.add("BML");
        AIRPORT_LIST.add("BMM");
        AIRPORT_LIST.add("BMN");
        AIRPORT_LIST.add("BMO");
        AIRPORT_LIST.add("BMP");
        AIRPORT_LIST.add("BMQ");
        AIRPORT_LIST.add("BMR");
        AIRPORT_LIST.add("BMS");
        AIRPORT_LIST.add("BMT");
        AIRPORT_LIST.add("BMU");
        AIRPORT_LIST.add("BMV");
        AIRPORT_LIST.add("BMW");
        AIRPORT_LIST.add("BMX");
        AIRPORT_LIST.add("BMY");
        AIRPORT_LIST.add("BMZ");
        AIRPORT_LIST.add("BNA");
        AIRPORT_LIST.add("BNB");
        AIRPORT_LIST.add("BNC");
        AIRPORT_LIST.add("BND");
        AIRPORT_LIST.add("BNE");
        AIRPORT_LIST.add("BNF");
        AIRPORT_LIST.add("BNG");
        AIRPORT_LIST.add("BNH");
        AIRPORT_LIST.add("BNI");
        AIRPORT_LIST.add("BNK");
        AIRPORT_LIST.add("BNL");
        AIRPORT_LIST.add("BNM");
        AIRPORT_LIST.add("BNN");
        AIRPORT_LIST.add("BNO");
        AIRPORT_LIST.add("BNP");
        AIRPORT_LIST.add("BNQ");
        AIRPORT_LIST.add("BNR");
        AIRPORT_LIST.add("BNS");
        AIRPORT_LIST.add("BNT");
        AIRPORT_LIST.add("BNU");
        AIRPORT_LIST.add("BNV");
        AIRPORT_LIST.add("BNW");
        AIRPORT_LIST.add("BNX");
        AIRPORT_LIST.add("BNY");
        AIRPORT_LIST.add("BNZ");
        AIRPORT_LIST.add("BOA");
        AIRPORT_LIST.add("BOB");
        AIRPORT_LIST.add("BOC");
        AIRPORT_LIST.add("BOD");
        AIRPORT_LIST.add("BOE");
        AIRPORT_LIST.add("BOG");
        AIRPORT_LIST.add("BOH");
        AIRPORT_LIST.add("BOI");
        AIRPORT_LIST.add("BOJ");
        AIRPORT_LIST.add("BOK");
        AIRPORT_LIST.add("BOL");
        AIRPORT_LIST.add("BOM");
        AIRPORT_LIST.add("BON");
        AIRPORT_LIST.add("BOO");
        AIRPORT_LIST.add("BOP");
        AIRPORT_LIST.add("BOQ");
        AIRPORT_LIST.add("BOS");
        AIRPORT_LIST.add("BOT");
        AIRPORT_LIST.add("BOU");
        AIRPORT_LIST.add("BOV");
        AIRPORT_LIST.add("BOW");
        AIRPORT_LIST.add("BOX");
        AIRPORT_LIST.add("BOY");
        AIRPORT_LIST.add("BOZ");
        AIRPORT_LIST.add("BPB");
        AIRPORT_LIST.add("BPC");
        AIRPORT_LIST.add("BPD");
        AIRPORT_LIST.add("BPE");
        AIRPORT_LIST.add("BPF");
        AIRPORT_LIST.add("BPG");
        AIRPORT_LIST.add("BPH");
        AIRPORT_LIST.add("BPI");
        AIRPORT_LIST.add("BPK");
        AIRPORT_LIST.add("BPL");
        AIRPORT_LIST.add("BPM");
        AIRPORT_LIST.add("BPN");
        AIRPORT_LIST.add("BPT");
        AIRPORT_LIST.add("BPX");
        AIRPORT_LIST.add("BPY");
        AIRPORT_LIST.add("BQA");
        AIRPORT_LIST.add("BQB");
        AIRPORT_LIST.add("BQE");
        AIRPORT_LIST.add("BQG");
        AIRPORT_LIST.add("BQH");
        AIRPORT_LIST.add("BQI");
        AIRPORT_LIST.add("BQJ");
        AIRPORT_LIST.add("BQK");
        AIRPORT_LIST.add("BQL");
        AIRPORT_LIST.add("BQN");
        AIRPORT_LIST.add("BQO");
        AIRPORT_LIST.add("BQQ");
        AIRPORT_LIST.add("BQS");
        AIRPORT_LIST.add("BQT");
        AIRPORT_LIST.add("BQU");
        AIRPORT_LIST.add("BQV");
        AIRPORT_LIST.add("BQW");
        AIRPORT_LIST.add("BRA");
        AIRPORT_LIST.add("BRB");
        AIRPORT_LIST.add("BRC");
        AIRPORT_LIST.add("BRD");
        AIRPORT_LIST.add("BRE");
        AIRPORT_LIST.add("BRH");
        AIRPORT_LIST.add("BRI");
        AIRPORT_LIST.add("BRJ");
        AIRPORT_LIST.add("BRK");
        AIRPORT_LIST.add("BRL");
        AIRPORT_LIST.add("BRM");
        AIRPORT_LIST.add("BRN");
        AIRPORT_LIST.add("BRO");
        AIRPORT_LIST.add("BRP");
        AIRPORT_LIST.add("BRQ");
        AIRPORT_LIST.add("BRR");
        AIRPORT_LIST.add("BRS");
        AIRPORT_LIST.add("BRT");
        AIRPORT_LIST.add("BRU");
        AIRPORT_LIST.add("BRV");
        AIRPORT_LIST.add("BRW");
        AIRPORT_LIST.add("BRX");
        AIRPORT_LIST.add("BRY");
        AIRPORT_LIST.add("BSA");
        AIRPORT_LIST.add("BSB");
        AIRPORT_LIST.add("BSC");
        AIRPORT_LIST.add("BSD");
        AIRPORT_LIST.add("BSE");
        AIRPORT_LIST.add("BSF");
        AIRPORT_LIST.add("BSG");
        AIRPORT_LIST.add("BSJ");
        AIRPORT_LIST.add("BSK");
        AIRPORT_LIST.add("BSL");
        AIRPORT_LIST.add("BSM");
        AIRPORT_LIST.add("BSN");
        AIRPORT_LIST.add("BSO");
        AIRPORT_LIST.add("BSP");
        AIRPORT_LIST.add("BSQ");
        AIRPORT_LIST.add("BSR");
        AIRPORT_LIST.add("BSS");
        AIRPORT_LIST.add("BST");
        AIRPORT_LIST.add("BSU");
        AIRPORT_LIST.add("BSV");
        AIRPORT_LIST.add("BSW");
        AIRPORT_LIST.add("BSX");
        AIRPORT_LIST.add("BSY");
        AIRPORT_LIST.add("BTA");
        AIRPORT_LIST.add("BTB");
        AIRPORT_LIST.add("BTC");
        AIRPORT_LIST.add("BTD");
        AIRPORT_LIST.add("BTE");
        AIRPORT_LIST.add("BTF");
        AIRPORT_LIST.add("BTG");
        AIRPORT_LIST.add("BTH");
        AIRPORT_LIST.add("BTI");
        AIRPORT_LIST.add("BTJ");
        AIRPORT_LIST.add("BTK");
        AIRPORT_LIST.add("BTL");
        AIRPORT_LIST.add("BTM");
        AIRPORT_LIST.add("BTN");
        AIRPORT_LIST.add("BTO");
        AIRPORT_LIST.add("BTP");
        AIRPORT_LIST.add("BTQ");
        AIRPORT_LIST.add("BTR");
        AIRPORT_LIST.add("BTS");
        AIRPORT_LIST.add("BTT");
        AIRPORT_LIST.add("BTU");
        AIRPORT_LIST.add("BTV");
        AIRPORT_LIST.add("BTW");
        AIRPORT_LIST.add("BTX");
        AIRPORT_LIST.add("BTY");
        AIRPORT_LIST.add("BUA");
        AIRPORT_LIST.add("BUB");
        AIRPORT_LIST.add("BUC");
        AIRPORT_LIST.add("BUD");
        AIRPORT_LIST.add("BUE");
        AIRPORT_LIST.add("BUF");
        AIRPORT_LIST.add("BUG");
        AIRPORT_LIST.add("BUH");
        AIRPORT_LIST.add("BUI");
        AIRPORT_LIST.add("BUJ");

    }


    private final String origin;
    private final String destination;

    AirportTuple(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public static AirportTuple buildAirportTuple(final String origin, final String destination) {
        List<String> airports = new ArrayList<>(AIRPORT_LIST);
        String originActual = origin;
        String destinationActual = destination;
        if (isOriginAndDestEmpty(origin, destination)) {
            originActual = airports.get(ThreadLocalRandom.current().nextInt(airports.size()));
            airports.remove(origin);
            destinationActual = airports.get(ThreadLocalRandom.current().nextInt(airports.size()));
        } else if (isOriginEmptyAndDestNotEmpty(origin, destination)) {
            List<String> filteredList = airports.stream()
                        .filter(s -> !s.equals(destination))
                        .collect(Collectors.toList());
            originActual = filteredList
                        .get(ThreadLocalRandom.current().nextInt(filteredList.size()));
            destinationActual = destination;
        } else if (isOriginNotEmptyAndDestEmpty(origin, destination) || origin.equals(destination)) {
            List<String> filteredList = airports.stream()
                        .filter(s -> !s.equals(origin))
                        .collect(Collectors.toList());
            destinationActual = filteredList
                        .get(ThreadLocalRandom.current().nextInt(filteredList.size()));
            originActual = origin;
        }

        return new AirportTuple(originActual, destinationActual);
    }

    private static boolean isOriginNotEmptyAndDestEmpty(String origin, String destination) {
        return !StringUtils.isEmpty(origin) && StringUtils.isEmpty(destination);
    }

    private static boolean isOriginEmptyAndDestNotEmpty(String origin, String destination) {
        return StringUtils.isEmpty(origin) && !StringUtils.isEmpty(destination);
    }

    private static boolean isOriginAndDestEmpty(String origin, String destination) {
        return StringUtils.isEmpty(origin) && StringUtils.isEmpty(destination);
    }

    public static AirportTuple buildAirportTuple(List<String> airports) {
        return buildAirportTuple(airports, false);
    }

    public static AirportTuple buildAirportTuple(List<String> airports, final boolean restrictSet) {
        int sizeBound = airports.size();
        if (restrictSet) {
            sizeBound = 6;
        }
        String originActual = airports.get(ThreadLocalRandom.current().nextInt(sizeBound));
        airports.remove(originActual);
        String destinationActual = airports.get(ThreadLocalRandom.current().nextInt(--sizeBound));
        return new AirportTuple(originActual, destinationActual);
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

}
