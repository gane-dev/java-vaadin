package com.example.vaadindemo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringView(name = DefaultView.VIEW_NAME)
public class DefaultView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "";
    @Autowired private ILoadLogDao loaderLog;
    @PostConstruct
    void init() {
        addComponent(new Label("This is the default view"));

        List<LoadLog> logs = loaderLog.getList();
        Grid<LoadLog> grid = new Grid<>();
        grid.setItems(logs);
        grid.addColumn(LoadLog::getMODULE_NAME).setCaption("Module");
        grid.addColumn(LoadLog::getSTEP).setCaption("Step");
        grid.addColumn(LoadLog::getSTATUS).setCaption("Status");
        grid.addColumn(LoadLog::getLOAD_NUM).setCaption("Id");
        grid.addColumn(LoadLog::getLOAD_START).setCaption("Start");
        grid.addColumn(LoadLog::getLOAD_FINISH).setCaption("Finish");
        grid.addColumn(LoadLog::getROWS_PROCESSED).setCaption("Rows");

        addComponent(grid);

    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}