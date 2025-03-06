package Nya1.server;

import Nya1.client.api.ApiException;
import Nya1.client.api.GreetApi;
import Nya1.client.model.GreetUpdate;
import Nya1.client.model.GreetResponse;

/**
 * Common utilities for all server test classes
 */
class Common {
    public static String getDefaultMessage(GreetApi greetApi) throws ApiException  {
        GreetResponse greetResponse = greetApi.getDefaultMessage();
        return greetResponse.getMessage();
    }

    public static String getMessage(GreetApi greetApi, String path) throws ApiException {
        GreetResponse greetResponse = greetApi.getMessage(path);
        return greetResponse.getMessage();
    }

    static void updateGreeting(GreetApi greetApi, String newGreeting) throws ApiException {
        greetApi.updateGreeting(new GreetUpdate().greeting(newGreeting));
    }
}
