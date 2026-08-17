package p219m3;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.collections.W;
import kotlin.io.c;
import kotlin.jvm.internal.Intrinsics;
import p291q3.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    private static final Map a(g gVar, String str) throws IOException {
        Cursor cursorZ2 = gVar.Z2("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorZ2.getColumnCount() <= 0) {
                Map mapI = N.i();
                c.a(cursorZ2, null);
                return mapI;
            }
            int columnIndex = cursorZ2.getColumnIndex("name");
            int columnIndex2 = cursorZ2.getColumnIndex("type");
            int columnIndex3 = cursorZ2.getColumnIndex("notnull");
            int columnIndex4 = cursorZ2.getColumnIndex("pk");
            int columnIndex5 = cursorZ2.getColumnIndex("dflt_value");
            Map mapC = N.c();
            while (cursorZ2.moveToNext()) {
                String name = cursorZ2.getString(columnIndex);
                String type = cursorZ2.getString(columnIndex2);
                boolean z10 = cursorZ2.getInt(columnIndex3) != 0;
                int i10 = cursorZ2.getInt(columnIndex4);
                String string = cursorZ2.getString(columnIndex5);
                Intrinsics.checkNotNullExpressionValue(name, "name");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                mapC.put(name, new e.a(name, type, z10, i10, string, 2));
            }
            Map mapB = N.b(mapC);
            c.a(cursorZ2, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(cursorZ2, th);
                throw th2;
            }
        }
    }

    private static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = CollectionsKt.c();
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(columnIndex);
            int i11 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(toColumnIndex)");
            listC.add(new e.d(i10, i11, string, string2));
        }
        return CollectionsKt.J0(CollectionsKt.a(listC));
    }

    private static final Set c(g gVar, String str) throws IOException {
        Cursor cursorZ2 = gVar.Z2("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorZ2.getColumnIndex("id");
            int columnIndex2 = cursorZ2.getColumnIndex("seq");
            int columnIndex3 = cursorZ2.getColumnIndex("table");
            int columnIndex4 = cursorZ2.getColumnIndex("on_delete");
            int columnIndex5 = cursorZ2.getColumnIndex("on_update");
            List listB = b(cursorZ2);
            cursorZ2.moveToPosition(-1);
            Set setB = W.b();
            while (cursorZ2.moveToNext()) {
                if (cursorZ2.getInt(columnIndex2) == 0) {
                    int i10 = cursorZ2.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((e.d) obj).h() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e.d dVar : arrayList3) {
                        arrayList.add(dVar.g());
                        arrayList2.add(dVar.i());
                    }
                    String string = cursorZ2.getString(columnIndex3);
                    Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorZ2.getString(columnIndex4);
                    Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorZ2.getString(columnIndex5);
                    Intrinsics.checkNotNullExpressionValue(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setA = W.a(setB);
            c.a(cursorZ2, null);
            return setA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(cursorZ2, th);
                throw th2;
            }
        }
    }

    private static final e.C0581e d(g gVar, String str, boolean z10) throws IOException {
        Cursor cursorZ2 = gVar.Z2("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorZ2.getColumnIndex("seqno");
            int columnIndex2 = cursorZ2.getColumnIndex("cid");
            int columnIndex3 = cursorZ2.getColumnIndex("name");
            int columnIndex4 = cursorZ2.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorZ2.moveToNext()) {
                    if (cursorZ2.getInt(columnIndex2) >= 0) {
                        int i10 = cursorZ2.getInt(columnIndex);
                        String columnName = cursorZ2.getString(columnIndex3);
                        String str2 = cursorZ2.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i10);
                        Intrinsics.checkNotNullExpressionValue(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "columnsMap.values");
                List listU0 = CollectionsKt.U0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues2, "ordersMap.values");
                e.C0581e c0581e = new e.C0581e(str, z10, listU0, CollectionsKt.U0(collectionValues2));
                c.a(cursorZ2, null);
                return c0581e;
            }
            c.a(cursorZ2, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(cursorZ2, th);
                throw th2;
            }
        }
    }

    private static final Set e(g gVar, String str) throws IOException {
        Cursor cursorZ2 = gVar.Z2("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorZ2.getColumnIndex("name");
            int columnIndex2 = cursorZ2.getColumnIndex("origin");
            int columnIndex3 = cursorZ2.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = W.b();
                while (cursorZ2.moveToNext()) {
                    if (Intrinsics.b("c", cursorZ2.getString(columnIndex2))) {
                        String name = cursorZ2.getString(columnIndex);
                        boolean z10 = true;
                        if (cursorZ2.getInt(columnIndex3) != 1) {
                            z10 = false;
                        }
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        e.C0581e c0581eD = d(gVar, name, z10);
                        if (c0581eD == null) {
                            c.a(cursorZ2, null);
                            return null;
                        }
                        setB.add(c0581eD);
                    }
                }
                Set setA = W.a(setB);
                c.a(cursorZ2, null);
                return setA;
            }
            c.a(cursorZ2, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                c.a(cursorZ2, th);
                throw th2;
            }
        }
    }

    public static final e f(g database, String tableName) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        return new e(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }
}
