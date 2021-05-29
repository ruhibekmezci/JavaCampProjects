package ruhiatakan.hrmsproject.core.utilities.business;

import ruhiatakan.hrmsproject.core.utilities.results.Result;

public class BusinessRules {
    public static Result run(Result... logics){
        for (Result result : logics)
        {
            if (!result.isSuccess())
            {
                return result;
            }
        }

        return null;
    }
}
