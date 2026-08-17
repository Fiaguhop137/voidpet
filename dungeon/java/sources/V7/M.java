package V7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public class M implements InterfaceC1561d, W7.b, InterfaceC1560c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final L7.c f14160f = L7.c.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U f14161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X7.a f14162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X7.a f14163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1562e f14164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f14165e;

    interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f14166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f14167b;

        private c(String str, String str2) {
            this.f14166a = str;
            this.f14167b = str2;
        }

        /* synthetic */ c(String str, String str2, a aVar) {
            this(str, str2);
        }
    }

    interface d {
        Object a();
    }

    M(X7.a aVar, X7.a aVar2, AbstractC1562e abstractC1562e, U u10, Provider provider) {
        this.f14161a = u10;
        this.f14162b = aVar;
        this.f14163c = aVar2;
        this.f14164d = abstractC1562e;
        this.f14165e = provider;
    }

    private List B0(SQLiteDatabase sQLiteDatabase, N7.o oVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lU0 = u0(sQLiteDatabase, oVar);
        if (lU0 == null) {
            return arrayList;
        }
        a1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lU0.toString()}, null, null, null, String.valueOf(i10)), new C1578v(this, arrayList, oVar));
        return arrayList;
    }

    public static /* synthetic */ Long F(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object G(Throwable th) {
        throw new W7.a("Timed out while trying to acquire the lock.", th);
    }

    private Map G0(SQLiteDatabase sQLiteDatabase, List list) {
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((AbstractC1568k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        a1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new z(map));
        return map;
    }

    private static byte[] J0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object K(String str, Q7.c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) a1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new y())).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object L(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2), null));
        }
        return null;
    }

    private void N0(Q7.a.C0157a c0157a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0157a.a(Q7.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public static /* synthetic */ Integer O(M m10, long j10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        String[] strArr = {String.valueOf(j10)};
        a1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new r(m10));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object P(M m10, List list, N7.o oVar, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            N7.i.a aVarK = N7.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                aVarK.h(new N7.h(V0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new N7.h(V0(cursor.getString(4)), m10.R0(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC1568k.a(j10, oVar, aVarK.d()));
        }
        return null;
    }

    private byte[] R0(long j10) {
        return (byte[]) a1(m0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new B());
    }

    public static /* synthetic */ Object S(M m10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m10.f14162b.a()).execute();
        return null;
    }

    private Object T0(d dVar, b bVar) {
        long jA = this.f14163c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f14163c.a() >= ((long) this.f14164d.b()) + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public static /* synthetic */ Q7.a U(M m10, String str, Map map, Q7.a.C0157a c0157a, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        return (Q7.a) a1(sQLiteDatabase.rawQuery(str, new String[0]), new A(m10, map, c0157a));
    }

    public static /* synthetic */ Long V(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    private static L7.c V0(String str) {
        return str == null ? f14160f : L7.c.b(str);
    }

    private static String W0(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((AbstractC1568k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static /* synthetic */ Q7.f Z(long j10, SQLiteDatabase sQLiteDatabase) {
        return (Q7.f) a1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new D(j10));
    }

    static Object a1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private Q7.c.b b0(int i10) {
        Q7.c.b bVar = Q7.c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        Q7.c.b bVar2 = Q7.c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        Q7.c.b bVar3 = Q7.c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        Q7.c.b bVar4 = Q7.c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        Q7.c.b bVar5 = Q7.c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        Q7.c.b bVar6 = Q7.c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        Q7.c.b bVar7 = Q7.c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        R7.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void c0(SQLiteDatabase sQLiteDatabase) {
        T0(new C1569l(sQLiteDatabase), new w());
    }

    public static /* synthetic */ Q7.f e(long j10, Cursor cursor) {
        cursor.moveToNext();
        return Q7.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    private long e0(SQLiteDatabase sQLiteDatabase, N7.o oVar) {
        Long lU0 = u0(sQLiteDatabase, oVar);
        if (lU0 != null) {
            return lU0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put("priority", Integer.valueOf(Y7.a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public static /* synthetic */ List f(M m10, N7.o oVar, SQLiteDatabase sQLiteDatabase) {
        List listB0 = m10.B0(sQLiteDatabase, oVar, m10.f14164d.d());
        for (L7.e eVar : L7.e.values()) {
            if (eVar != oVar.d()) {
                int iD = m10.f14164d.d() - listB0.size();
                if (iD <= 0) {
                    break;
                }
                listB0.addAll(m10.B0(sQLiteDatabase, oVar.f(eVar), iD));
            }
        }
        return m10.z0(listB0, m10.G0(sQLiteDatabase, listB0));
    }

    public static /* synthetic */ List g(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(N7.o.a().b(cursor.getString(1)).d(Y7.a.b(cursor.getInt(2))).c(J0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object h(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.b(cursor.getInt(0), Q7.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ SQLiteDatabase i(Throwable th) {
        throw new W7.a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Object k(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.b(cursor.getInt(0), Q7.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object m(M m10, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        a1(sQLiteDatabase.rawQuery(str2, null), new C1577u(m10));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean o(M m10, N7.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long lU0 = m10.u0(sQLiteDatabase, oVar);
        return lU0 == null ? Boolean.FALSE : (Boolean) a1(m10.m0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lU0.toString()}), new C1576t());
    }

    public static /* synthetic */ Object p(long j10, N7.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(Y7.a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put("priority", Integer.valueOf(Y7.a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    private Q7.b q0() {
        return Q7.b.b().b(Q7.e.c().b(h0()).c(AbstractC1562e.f14199a.f()).a()).a();
    }

    public static /* synthetic */ byte[] r(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    private long r0() {
        return m0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public static /* synthetic */ List s(SQLiteDatabase sQLiteDatabase) {
        return (List) a1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new J());
    }

    private long s0() {
        return m0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ Q7.a t(M m10, Map map, Q7.a.C0157a c0157a, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            Q7.c.b bVarB0 = m10.b0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(Q7.c.c().c(bVarB0).b(j10).a());
        }
        m10.N0(c0157a, map);
        c0157a.e(m10.t0());
        c0157a.d(m10.q0());
        c0157a.c((String) m10.f14165e.get());
        return c0157a.b();
    }

    private Q7.f t0() {
        return (Q7.f) v0(new C(this.f14162b.a()));
    }

    private Long u0(SQLiteDatabase sQLiteDatabase, N7.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(Y7.a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) a1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new x());
    }

    public static /* synthetic */ Long x(M m10, N7.i iVar, N7.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m10.y0()) {
            m10.b(1L, Q7.c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jE0 = m10.e0(sQLiteDatabase, oVar);
        int iE = m10.f14164d.e();
        byte[] bArrA = iVar.e().a();
        boolean z10 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jE0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    private boolean y0() {
        return r0() * s0() >= this.f14164d.f();
    }

    public static /* synthetic */ Object z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    private List z0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1568k abstractC1568k = (AbstractC1568k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC1568k.c()))) {
                N7.i.a aVarL = abstractC1568k.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC1568k.c()))) {
                    aVarL.c(cVar.f14166a, cVar.f14167b);
                }
                listIterator.set(AbstractC1568k.a(abstractC1568k.c(), abstractC1568k.d(), aVarL.d()));
            }
        }
        return list;
    }

    @Override // V7.InterfaceC1561d
    public AbstractC1568k A0(N7.o oVar, N7.i iVar) {
        R7.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long jLongValue = ((Long) v0(new C1570m(this, iVar, oVar))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC1568k.a(jLongValue, oVar, iVar);
    }

    @Override // V7.InterfaceC1561d
    public Iterable E0() {
        return (Iterable) v0(new G());
    }

    @Override // V7.InterfaceC1561d
    public void L1(N7.o oVar, long j10) {
        v0(new C1572o(j10, oVar));
    }

    @Override // V7.InterfaceC1561d
    public void R1(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            v0(new K(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + W0(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    @Override // V7.InterfaceC1560c
    public void a() {
        v0(new C1573p(this));
    }

    @Override // V7.InterfaceC1560c
    public void b(long j10, Q7.c.b bVar, String str) {
        v0(new C1574q(str, bVar, j10));
    }

    @Override // V7.InterfaceC1560c
    public Q7.a c() {
        return (Q7.a) v0(new C1575s(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), Q7.a.e()));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14161a.close();
    }

    @Override // W7.b
    public Object d(W7.b.a aVar) {
        SQLiteDatabase sQLiteDatabaseM0 = m0();
        c0(sQLiteDatabaseM0);
        try {
            Object objT = aVar.t();
            sQLiteDatabaseM0.setTransactionSuccessful();
            return objT;
        } finally {
            sQLiteDatabaseM0.endTransaction();
        }
    }

    @Override // V7.InterfaceC1561d
    public void d0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            m0().compileStatement("DELETE FROM events WHERE _id in " + W0(iterable)).execute();
        }
    }

    @Override // V7.InterfaceC1561d
    public boolean g2(N7.o oVar) {
        return ((Boolean) v0(new C1571n(this, oVar))).booleanValue();
    }

    @Override // V7.InterfaceC1561d
    public Iterable g3(N7.o oVar) {
        return (Iterable) v0(new L(this, oVar));
    }

    long h0() {
        return r0() * s0();
    }

    SQLiteDatabase m0() {
        U u10 = this.f14161a;
        Objects.requireNonNull(u10);
        return (SQLiteDatabase) T0(new E(u10), new F());
    }

    Object v0(b bVar) {
        SQLiteDatabase sQLiteDatabaseM0 = m0();
        sQLiteDatabaseM0.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseM0);
            sQLiteDatabaseM0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM0.endTransaction();
        }
    }

    @Override // V7.InterfaceC1561d
    public long x1(N7.o oVar) {
        return ((Long) a1(m0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(Y7.a.a(oVar.d()))}), new H())).longValue();
    }

    @Override // V7.InterfaceC1561d
    public int y() {
        return ((Integer) v0(new I(this, this.f14162b.a() - this.f14164d.c()))).intValue();
    }
}
