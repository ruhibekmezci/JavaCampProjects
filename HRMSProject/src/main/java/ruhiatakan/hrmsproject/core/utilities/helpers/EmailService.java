package ruhiatakan.hrmsproject.core.utilities.helpers;

import ruhiatakan.hrmsproject.core.utilities.results.Result;

public interface EmailService {
    Result send(String to, String title, String message);
}
