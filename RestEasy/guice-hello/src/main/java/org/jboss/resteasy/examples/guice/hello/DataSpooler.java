package org.jboss.resteasy.examples.guice.hello;

import javax.ws.rs.*;


/**
 * Created by IntelliJ IDEA. User: yambrosov Date: 16.09.11 Time: 14:11 To change this template use File | Settings |
 * File Templates.
 */
@Path("dataspooler")
public class DataSpooler
{
  @GET
  @Path("/")
  public String getInfo()
  {
    return "I'm dataspooler ";
  }


  @GET
  @Path("{remoteName}")
  public String getInfo(@PathParam("remoteName") final String remoteName)
  {
    return "Hello, " + remoteName + ". I'm dataspooler ";
  }


  @GET
  @Path("getObjects/")
  public String getInfo(@QueryParam("rid") String rid,
                        @QueryParam("start") int start,
                        @QueryParam("size") int size)
  {
    return "Requested update: " + "rid= " + rid + "; start= " + start + "; size= " + size;
  }


  @GET
  @Path("/displayUserAgent")
  public String getUserUpdate(@HeaderParam("User-Agent") String userAgent)
  {
    return "User-Agent is " + userAgent;
  }

}
