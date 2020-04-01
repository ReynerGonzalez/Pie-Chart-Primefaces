package com.reynergonzalez.piesample;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
public class PieChart implements Serializable {

    private PieChartModel pieModel;

    @PostConstruct
    public void init() {
        createPieModels();
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    private void createPieModels() {
        createPieModel();
    }

    private void createPieModel() {
        pieModel = new PieChartModel();
        pieModel.set("Reyner", 700);
        pieModel.set("Jose", 300);
        pieModel.set("Pedro", 400);
        pieModel.setTitle("Puntuaciones");
        pieModel.setLegendPosition("c");
    }
}
