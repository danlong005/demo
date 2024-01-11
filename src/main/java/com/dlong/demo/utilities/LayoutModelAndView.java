package com.dlong.demo.utilities;

import java.util.HashMap;

import org.springframework.web.servlet.ModelAndView;

public class LayoutModelAndView {
    public static ModelAndView create(String view, HashMap<String, Object> model) {
        model.put("body", view + ".ftl");
        String[] names = view.split("/");
        String pageName = names[1].substring(0, 1).toUpperCase() + names[1].substring(1);
        model.put("pageName", pageName);

        return new ModelAndView("layouts/layout", model);
    }

    public static ModelAndView redirect(String url) {
        return new ModelAndView(url);
    }
}
