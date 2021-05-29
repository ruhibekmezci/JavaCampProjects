package ruhiatakan.hrmsproject.core.utilities;

import ruhiatakan.hrmsproject.core.utilities.results.Result;
import ruhiatakan.hrmsproject.core.utilities.results.SuccessResult;

public class MernisServiceAdapter implements IdentityValidationService{
    @Override
    public Result validate(String tckn, String firstName, String lastName, int yearOfDate) {
        return new SuccessResult("Kimlik Doğrulaması Başarılı");
    }
}
