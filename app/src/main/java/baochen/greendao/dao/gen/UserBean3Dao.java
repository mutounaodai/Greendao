package baochen.greendao.dao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import baochen.greendao.bean.UserBean3;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USER_BEAN3".
*/
public class UserBean3Dao extends AbstractDao<UserBean3, Long> {

    public static final String TABLENAME = "USER_BEAN3";

    /**
     * Properties of entity UserBean3.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property AuthorTag = new Property(1, String.class, "authorTag", false, "AUTHOR_TAG");
    };

    private DaoSession daoSession;


    public UserBean3Dao(DaoConfig config) {
        super(config);
    }
    
    public UserBean3Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"USER_BEAN3\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"AUTHOR_TAG\" TEXT UNIQUE );"); // 1: authorTag
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"USER_BEAN3\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UserBean3 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String authorTag = entity.getAuthorTag();
        if (authorTag != null) {
            stmt.bindString(2, authorTag);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UserBean3 entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String authorTag = entity.getAuthorTag();
        if (authorTag != null) {
            stmt.bindString(2, authorTag);
        }
    }

    @Override
    protected final void attachEntity(UserBean3 entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public UserBean3 readEntity(Cursor cursor, int offset) {
        UserBean3 entity = new UserBean3( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // authorTag
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UserBean3 entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAuthorTag(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(UserBean3 entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(UserBean3 entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
