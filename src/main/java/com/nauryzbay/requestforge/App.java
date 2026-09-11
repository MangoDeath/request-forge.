package com.nauryzbay.requestforge;

public class App {
    public static void main(String[] args) {
        RequestDirector director = new RequestDirector();
        String usersUrl = "https://api.example.com/users";

        ApiRequestBuilder objBuilder = new ApiRequestBuilder();
        director.makeCreateUserRequest(objBuilder, usersUrl);
        ApiRequest createUserRequest = objBuilder.getResult();
        System.out.println(createUserRequest);


        CurlCommandBuilder curlBuilder = new CurlCommandBuilder();
        director.makeCreateUserRequest(curlBuilder, usersUrl);
        String curlCommand = curlBuilder.getResult();
        System.out.println(curlCommand);

        CurlCommandBuilder getBuilder = new CurlCommandBuilder();
        director.makeGetUserRequest(getBuilder, usersUrl);
        System.out.println(getBuilder.getResult());
    }
}