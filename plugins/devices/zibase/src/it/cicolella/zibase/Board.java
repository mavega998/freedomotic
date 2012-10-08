/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cicolella.zibase;

/**
 *
 * @author windows
 */
public class Board {

    private String ipAddress = null;
    private String sensorsUrl;
    private String commandsUrl;
    private int port;

    public Board(String ipAddress, int port) {
        setIpAddress(ipAddress);
        setPort(port);
      }

    public String getSensorsUrl() {
        return sensorsUrl;
    }

    public void setSensorsUrl(String sensorsUrl) {
        this.sensorsUrl = sensorsUrl;
    }

    public String getCommandsUrl() {
        return commandsUrl;
    }

    public void setCommandsUrl(String commandsUrl) {
        this.commandsUrl = commandsUrl;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}