package turtle;

public class Position {
    private int rows;
    private int columns;


    public Position(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public String toString(){
        return String.format("""
                row = %d
                column = %d""",rows, columns);
    }
    @Override
    public boolean equals(Object o){
        Position compared = (Position)o;
        if(compared.columns == this.columns && compared.rows == this.rows){return true;}
        return false;
    }


    public int getColumns() {
        return columns;
    }

    public void setColumn(int column) {
        this.columns = column;
    }
    public void setRows(int row){
        this.rows = row;
    }
    public int getRows(){
        return rows;
    }
}
