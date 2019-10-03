package com.eversis.datetimepicker.api;

import com.liferay.portal.kernel.editor.configuration.BaseEditorConfigContributor;
import com.liferay.portal.kernel.editor.configuration.EditorConfigContributor;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.RequestBackedPortletURLFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import org.osgi.service.component.annotations.Component;

import java.util.Map;

@Component(
        property = {"editor.name=tinymce",
                "service.ranking:Integer=100"},
        service = EditorConfigContributor.class
)
public class DateTimePickerIcon extends BaseEditorConfigContributor {

    @Override
    public void populateConfigJSONObject(JSONObject jsonObject, Map<String, Object> inputEditorTaglibAttributes,
            ThemeDisplay themeDisplay, RequestBackedPortletURLFactory requestBackedPortletURLFactory) {

        JSONArray plugins = jsonObject.getJSONArray("plugins");

        plugins.put("insertdatetime");

        JSONArray toolbar = jsonObject.getJSONArray("toolbar");

        toolbar.put("insertdatetime");
    }
}