import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableExample1 {

	public static void main(String[] args) {
JFrame f=new JFrame("Table Example");
String data[][]= {{"101","Amit","670000"},
		{"102","Sachin","700000"},
		};
String column[]= {"ID","Name","Salary"};
final JTable jt=new JTable(data,column);
jt.setCellSelectionEnabled(true);
ListSelectionModel select=jt.getSelectionModel();
select.addListSelectionListener(new ListSelectionListener() {
	public void valueChanged(ListSelectionEvent e) {
		String Data=null;
		int[] row=jt.getSelectedRows();
		int[] columns=jt.getSelectedColumns();
		for(int i=0;i<row.length;i++) {
			for(int j=0;j<column.length;j++) {
				Data=(String)jt.getValueAt(row[i], column[j]);
			}
		}
		System.out.println("Table Element Selected is:"+Data);
	});

JScrollPane sp=new JScrollPane(jt);
f.add(sp);
f.setSize(300,200);
f.setVisible(true);
}

	}

}
