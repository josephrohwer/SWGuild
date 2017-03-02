/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.dvdlibrarymvc.controller;

import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.TableRow;
import com.google.visualization.datasource.datatable.value.ValueType;
import com.google.visualization.datasource.render.JsonRenderer;
import com.thesoftwareguild.dvdlibrarymvc.dao.DVDLibrary;
import com.thesoftwareguild.dvdlibrarymvc.dto.DVDCount;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author josephrohwer
 */
@Controller
public class StatsController {

    private DVDLibrary dao;

    @Inject
    public StatsController(DVDLibrary dao) {
        this.dao = dao;
    }

    @RequestMapping(value = "/stats", method = RequestMethod.GET)
    public String displayStatsPage() {
        return "stats";
    }

    @RequestMapping(value = "/stats/chart", method = RequestMethod.GET)
    @ResponseBody
    public String getDataTable() {
        try {
            List<DVDCount> counts = dao.getStudioDVDCounts();

            DataTable t = new DataTable();
            t.addColumn(new ColumnDescription("Studio_Name",
                    ValueType.TEXT,
                    "Studio"));
            t.addColumn(new ColumnDescription("Number_Dvds",
                    ValueType.NUMBER,
                    "# DVDs"));

            for (DVDCount currentCount : counts) {
                TableRow tr = new TableRow();
                tr.addCell(currentCount.getStudio());
                tr.addCell(currentCount.getNumDVDS());
                t.addRow(tr);
            }
            return JsonRenderer.renderDataTable(t, true, false, false).toString();
        } catch (Exception e) {
            return "Invalid Data";
        }
    }
}
