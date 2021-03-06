package es.ucm.fdi.tp.extra.jcolor;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	* 
	*/

	private String[] colNames;
	List<String> names;

	public TableModel() {
		this.colNames = new String[] { "#Player", "Color" };
		names = new ArrayList<>();
		names.add("");
		names.add("");
	}

	public TableModel(int n) {
		this.colNames = new String[] { "#Player", "Color" };
		names = new ArrayList<>();
		for (int i = 0; i < n; i++)
			names.add("");
	}

	@Override
	public String getColumnName(int col) {
		return colNames[col];
	}

	@Override
	public int getColumnCount() {
		return colNames.length;
	}

	@Override
	public int getRowCount() {
		return names != null ? names.size() : 0;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex == 0) {
			return rowIndex;
		} else {
			return names.get(rowIndex);
		}
	}

	/*public int getPlayersCount() {
		return this.names.size();
	}*/

	public void addName(String name) {
		names.add(name);
		refresh();
	}

	public void refresh() {
		fireTableDataChanged();
	}

};