package com.example.machenike.qz.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.machenike.qz.bean.DataBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DATA_BEAN".
*/
public class DataBeanDao extends AbstractDao<DataBean, Long> {

    public static final String TABLENAME = "DATA_BEAN";

    /**
     * Properties of entity DataBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property NewId = new Property(0, Long.class, "newId", true, "_id");
        public final static Property Desc = new Property(1, String.class, "desc", false, "DESC");
        public final static Property Id = new Property(2, int.class, "id", false, "ID");
        public final static Property ImagePath = new Property(3, String.class, "imagePath", false, "IMAGE_PATH");
        public final static Property IsVisible = new Property(4, int.class, "isVisible", false, "IS_VISIBLE");
        public final static Property Order = new Property(5, int.class, "order", false, "ORDER");
        public final static Property Title = new Property(6, String.class, "title", false, "TITLE");
        public final static Property Type = new Property(7, int.class, "type", false, "TYPE");
        public final static Property Url = new Property(8, String.class, "url", false, "URL");
    }


    public DataBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DataBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DATA_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: newId
                "\"DESC\" TEXT," + // 1: desc
                "\"ID\" INTEGER NOT NULL ," + // 2: id
                "\"IMAGE_PATH\" TEXT," + // 3: imagePath
                "\"IS_VISIBLE\" INTEGER NOT NULL ," + // 4: isVisible
                "\"ORDER\" INTEGER NOT NULL ," + // 5: order
                "\"TITLE\" TEXT," + // 6: title
                "\"TYPE\" INTEGER NOT NULL ," + // 7: type
                "\"URL\" TEXT);"); // 8: url
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DATA_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DataBean entity) {
        stmt.clearBindings();
 
        Long newId = entity.getNewId();
        if (newId != null) {
            stmt.bindLong(1, newId);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(2, desc);
        }
        stmt.bindLong(3, entity.getId());
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(4, imagePath);
        }
        stmt.bindLong(5, entity.getIsVisible());
        stmt.bindLong(6, entity.getOrder());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(7, title);
        }
        stmt.bindLong(8, entity.getType());
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(9, url);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DataBean entity) {
        stmt.clearBindings();
 
        Long newId = entity.getNewId();
        if (newId != null) {
            stmt.bindLong(1, newId);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(2, desc);
        }
        stmt.bindLong(3, entity.getId());
 
        String imagePath = entity.getImagePath();
        if (imagePath != null) {
            stmt.bindString(4, imagePath);
        }
        stmt.bindLong(5, entity.getIsVisible());
        stmt.bindLong(6, entity.getOrder());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(7, title);
        }
        stmt.bindLong(8, entity.getType());
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(9, url);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DataBean readEntity(Cursor cursor, int offset) {
        DataBean entity = new DataBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // newId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // desc
            cursor.getInt(offset + 2), // id
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // imagePath
            cursor.getInt(offset + 4), // isVisible
            cursor.getInt(offset + 5), // order
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // title
            cursor.getInt(offset + 7), // type
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // url
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DataBean entity, int offset) {
        entity.setNewId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDesc(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setId(cursor.getInt(offset + 2));
        entity.setImagePath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIsVisible(cursor.getInt(offset + 4));
        entity.setOrder(cursor.getInt(offset + 5));
        entity.setTitle(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setType(cursor.getInt(offset + 7));
        entity.setUrl(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DataBean entity, long rowId) {
        entity.setNewId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DataBean entity) {
        if(entity != null) {
            return entity.getNewId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DataBean entity) {
        return entity.getNewId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}