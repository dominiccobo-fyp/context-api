package com.dominiccobo.fyp.api.queries;

public class GetWebAppForUpstreamUrl {

    public final String upstreamUrl;

    public GetWebAppForUpstreamUrl(String upstreamUrl) {
        this.upstreamUrl = upstreamUrl;
    }

    public static class Result {
        public final String webAppUrl;

        public Result(String webAppUrl) {
            this.webAppUrl = webAppUrl;
        }
    }
}
