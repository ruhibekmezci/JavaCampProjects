package ruhiatakan.hrmsproject.core.utilities.helpers;

import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.core.utilities.results.SuccessResult;

public class EmailManager implements EmailService{

    @Override
    public Result send(String to, String title, String message) {
        return new SuccessResult("E-posta başarıyla gönderildi.");
    }
}
