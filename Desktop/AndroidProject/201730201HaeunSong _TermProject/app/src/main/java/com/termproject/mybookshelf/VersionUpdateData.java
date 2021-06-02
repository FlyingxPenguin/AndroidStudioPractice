package com.termproject.mybookshelf;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "versions")
public class VersionUpdateData {
    @Element(name = "official_code")
    private int version_code;

    @Element(name = "official_name")
    private String version_name;


    public int getVersion_code() {
        return version_code;
    }

    public String getVersion_name() {
        return version_name;
    }
}
