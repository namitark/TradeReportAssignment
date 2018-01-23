package org.jpm.trade.report.util;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.jpm.trade.report.constants.TradeConstants;

/**
 * This utility class is used to covert Date to String and vice versa.
 * @author Namita
 *
 */
public class DateConverter {

    /**
     *
     * @param inputString
     * @return
     * @throws DateTimeParseException
     */
    public static LocalDate convertStringToDate(String inputString) throws DateTimeParseException {

        return LocalDate.parse(inputString);
    }

    /**
     *
     * @param inputDate
     * @return String value of the given date
     * @throws DateTimeException
     */
    public static String convertDateToString(LocalDate inputDate) throws DateTimeException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(TradeConstants.YYYY_MM_DD);
        return inputDate.format(formatter);

    }
}