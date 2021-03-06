package com.github.k0kubun.github_ranking.server;

import com.github.k0kubun.github_ranking.api.JobResource;
import com.github.k0kubun.github_ranking.api.RoutesResource;
import com.treasuredata.underwrap.UnderwrapServer;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class ApiApplication
        extends UnderwrapServer.UnderwrapApplication
{
    @Override
    protected void registerResources(Set<Class<?>> classes)
    {
        classes.add(JobResource.class);
        classes.add(RoutesResource.class);
    }
}
