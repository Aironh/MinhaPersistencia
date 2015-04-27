import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by aluno on 27/04/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    private static final String BANCO_DADOS = "MeuBanco";
    private static int VERSAO = 1;

    public DatabaseHelper(Context context) {
        super(context, BANCO_DADOS, null, VERSAO);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String ddl = "CREATE TABLE pessoa("+"_id INTEGER PRIMARY KEY AUTOINCREMENT,"+"nome TEXT NOT NULL"+")";
        db.execSQL(ddl);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
