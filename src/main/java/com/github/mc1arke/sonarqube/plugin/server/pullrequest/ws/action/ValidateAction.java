package com.github.mc1arke.sonarqube.plugin.server.pullrequest.ws.action;

import org.sonar.api.server.ws.Request;
import org.sonar.api.server.ws.Response;
import org.sonar.api.server.ws.WebService;
import org.sonar.db.DbClient;
import org.sonar.server.user.UserSession;

public class ValidateAction extends AlmSettingsWsAction {
    private static final String KEY_PARAMETER = "key";

    private final DbClient dbClient;
    private final UserSession userSession;

    public ValidateAction(DbClient dbClient, UserSession userSession) {
        super(dbClient);
        this.dbClient = dbClient;
        this.userSession = userSession;
    }

    @Override
    public void define(WebService.NewController context) {
        WebService.NewAction action = context.createAction("validate").setHandler(this);

        action.createParam(KEY_PARAMETER).setRequired(true);
    }

    @Override
    public void handle(Request request, Response response) throws Exception {
        response.noContent();
    }
}
