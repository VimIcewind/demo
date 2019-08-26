package com.vimemacs.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by HWD on 2019/8/24 15:37
 */
@Component
public class VimEmacsProperties {
    @Value("${com.vimemacs.title}")
    private String title;
    @Value("${com.vimemacs.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
