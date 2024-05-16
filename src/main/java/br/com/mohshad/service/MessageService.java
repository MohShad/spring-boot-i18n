package br.com.mohshad.service;

import java.util.List;
import java.util.Locale;


public interface MessageService {

    String getMessage(String prefix, String key);

    String getMessage(String prefix, String key, String value);

    String getMessage(String prefix, String key, List<String> args);

    String getMessage(String prefix, String key, List<String> args, Locale requestedLocale);

    String getRequestLocalizedMessage(String prefix, String key);

    String getRequestLocalizedMessage(String prefix, String key, List<String> args);

}
