/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.wittakarn.rest.service;

import com.blogspot.wittakarn.domain.Track;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.server.JSONP;

/**
 *
 * @author Wittakarn
 */
@Path("/json/metallica")
public class JSONService {

    @GET
    @Path("/get")
    @JSONP(queryParam = "callback")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON() {

        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");
        System.out.println(track);

        return track;

    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Track createTrackInJSON(Track track) {
        String result = "Track saved : " + track;
        System.out.println(result);
        return track;
    }
}
