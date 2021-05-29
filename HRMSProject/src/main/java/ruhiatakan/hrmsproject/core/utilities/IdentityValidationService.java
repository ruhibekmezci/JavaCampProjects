package ruhiatakan.hrmsproject.core.utilities;

import ruhiatakan.hrmsproject.core.utilities.results.Result;

public interface IdentityValidationService {
    Result validate(String tckn, String firstName, String lastName, int yearOfDate);
}
