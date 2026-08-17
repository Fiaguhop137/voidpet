package p140hd;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p183k3.q;
import p183k3.t;
import p183k3.w;
import p291q3.k;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends p140hd.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f42846l = new j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f42847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p183k3.i f42848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p122gd.b f42849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p183k3.h f42850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f42851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f42852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f42853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f42854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f42855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f42856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f42857k;

    public static final class a extends p183k3.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f42858d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, f fVar) {
            super(qVar);
            this.f42858d = fVar;
        }

        @Override // p183k3.w
        protected String e() {
            return "INSERT OR ABORT INTO `updates` (`id`,`commit_time`,`runtime_version`,`scope_key`,`manifest`,`url`,`headers`,`launch_asset_id`,`status`,`keep`,`last_accessed`,`successful_launch_count`,`failed_launch_count`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p183k3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, p158id.d entity) throws JSONException {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.R2(1, this.f42858d.f42849c.n(entity.d()));
            Long lB = this.f42858d.f42849c.b(entity.b());
            if (lB == null) {
                statement.q3(2);
            } else {
                statement.N2(2, lB.longValue());
            }
            statement.n2(3, entity.k());
            statement.n2(4, entity.l());
            String strF = this.f42858d.f42849c.f(entity.i());
            if (strF == null) {
                statement.q3(5);
            } else {
                statement.n2(5, strF);
            }
            String strM = this.f42858d.f42849c.m(entity.o());
            if (strM == null) {
                statement.q3(6);
            } else {
                statement.n2(6, strM);
            }
            String strI = this.f42858d.f42849c.i(entity.j());
            if (strI == null) {
                statement.q3(7);
            } else {
                statement.n2(7, strI);
            }
            Long lG = entity.g();
            if (lG == null) {
                statement.q3(8);
            } else {
                statement.N2(8, lG.longValue());
            }
            statement.N2(9, this.f42858d.f42849c.h(entity.m()));
            statement.N2(10, entity.e() ? 1L : 0L);
            Long lB2 = this.f42858d.f42849c.b(entity.f());
            if (lB2 == null) {
                statement.q3(11);
            } else {
                statement.N2(11, lB2.longValue());
            }
            statement.N2(12, entity.n());
            statement.N2(13, entity.c());
        }
    }

    public static final class b extends p183k3.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f42859d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, f fVar) {
            super(qVar);
            this.f42859d = fVar;
        }

        @Override // p183k3.w
        protected String e() {
            return "DELETE FROM `updates` WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p183k3.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, p158id.d entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.R2(1, this.f42859d.f42849c.n(entity.d()));
        }
    }

    public static final class c extends w {
        c(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE updates SET keep = 1 WHERE id = ?;";
        }
    }

    public static final class d extends w {
        d(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE updates SET status = ? WHERE id = ?;";
        }
    }

    public static final class e extends w {
        e(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE updates SET scope_key = ? WHERE id = ?;";
        }
    }

    /* JADX INFO: renamed from: hd.f$f, reason: collision with other inner class name */
    public static final class C0501f extends w {
        C0501f(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE updates SET commit_time = ? WHERE id = ?;";
        }
    }

    public static final class g extends w {
        g(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE updates SET last_accessed = ? WHERE id = ?;";
        }
    }

    public static final class h extends w {
        h(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE updates SET successful_launch_count = successful_launch_count + 1 WHERE id = ?;";
        }
    }

    public static final class i extends w {
        i(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE updates SET failed_launch_count = failed_launch_count + 1 WHERE id = ?;";
        }
    }

    public static final class j {
        private j() {
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return CollectionsKt.l();
        }
    }

    public f(q __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f42849c = new p122gd.b();
        this.f42847a = __db;
        this.f42848b = new a(__db, this);
        this.f42850d = new b(__db, this);
        this.f42851e = new c(__db);
        this.f42852f = new d(__db);
        this.f42853g = new e(__db);
        this.f42854h = new C0501f(__db);
        this.f42855i = new g(__db);
        this.f42856j = new h(__db);
        this.f42857k = new i(__db);
    }

    @Override // p140hd.e
    public void a(UUID id2, String newScopeKey) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(newScopeKey, "newScopeKey");
        this.f42847a.d();
        k kVarB = this.f42853g.b();
        kVarB.n2(1, newScopeKey);
        kVarB.R2(2, this.f42849c.n(id2));
        try {
            this.f42847a.e();
            try {
                kVarB.n0();
                this.f42847a.z();
                this.f42847a.i();
                this.f42853g.h(kVarB);
            } catch (Throwable th) {
                this.f42847a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42853g.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.e
    public void b(List updates) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        this.f42847a.d();
        this.f42847a.e();
        try {
            this.f42850d.k(updates);
            this.f42847a.z();
        } finally {
            this.f42847a.i();
        }
    }

    @Override // p140hd.e
    public void d(UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f42847a.d();
        k kVarB = this.f42857k.b();
        kVarB.R2(1, this.f42849c.n(id2));
        try {
            this.f42847a.e();
            try {
                kVarB.n0();
                this.f42847a.z();
                this.f42847a.i();
                this.f42857k.h(kVarB);
            } catch (Throwable th) {
                this.f42847a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42857k.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.e
    protected void f(UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f42847a.d();
        k kVarB = this.f42856j.b();
        kVarB.R2(1, this.f42849c.n(id2));
        try {
            this.f42847a.e();
            try {
                kVarB.n0();
                this.f42847a.z();
                this.f42847a.i();
                this.f42856j.h(kVarB);
            } catch (Throwable th) {
                this.f42847a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42856j.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.e
    public void g(p158id.d update) {
        Intrinsics.checkNotNullParameter(update, "update");
        this.f42847a.d();
        this.f42847a.e();
        try {
            this.f42848b.j(update);
            this.f42847a.z();
        } finally {
            this.f42847a.i();
        }
    }

    @Override // p140hd.e
    protected void h(UUID id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f42847a.d();
        k kVarB = this.f42851e.b();
        kVarB.R2(1, this.f42849c.n(id2));
        try {
            this.f42847a.e();
            try {
                kVarB.n0();
                this.f42847a.z();
                this.f42847a.i();
                this.f42851e.h(kVarB);
            } catch (Throwable th) {
                this.f42847a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42851e.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.e
    public List i() throws Throwable {
        t tVar;
        String str = "getString(...)";
        t tVarA = t.f47930i.a("SELECT * FROM updates;", 0);
        this.f42847a.d();
        Cursor cursorB = p219m3.b.b(this.f42847a, tVarA, false, null);
        try {
            int iE = p219m3.a.e(cursorB, "id");
            int iE2 = p219m3.a.e(cursorB, "commit_time");
            int iE3 = p219m3.a.e(cursorB, "runtime_version");
            int iE4 = p219m3.a.e(cursorB, "scope_key");
            int iE5 = p219m3.a.e(cursorB, "manifest");
            int iE6 = p219m3.a.e(cursorB, "url");
            int iE7 = p219m3.a.e(cursorB, "headers");
            int iE8 = p219m3.a.e(cursorB, "launch_asset_id");
            int iE9 = p219m3.a.e(cursorB, "status");
            int iE10 = p219m3.a.e(cursorB, "keep");
            int iE11 = p219m3.a.e(cursorB, "last_accessed");
            int iE12 = p219m3.a.e(cursorB, "successful_launch_count");
            tVar = tVarA;
            try {
                int iE13 = p219m3.a.e(cursorB, "failed_launch_count");
                int i10 = iE12;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    byte[] blob = cursorB.getBlob(iE);
                    int i11 = iE;
                    Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                    UUID uuidA = this.f42849c.a(blob);
                    Date dateG = this.f42849c.g(cursorB.isNull(iE2) ? null : Long.valueOf(cursorB.getLong(iE2)));
                    if (dateG == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    String string = cursorB.getString(iE3);
                    Intrinsics.checkNotNullExpressionValue(string, str);
                    String string2 = cursorB.getString(iE4);
                    Intrinsics.checkNotNullExpressionValue(string2, str);
                    JSONObject jSONObjectJ = this.f42849c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5));
                    if (jSONObjectJ == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.");
                    }
                    p158id.d dVar = new p158id.d(uuidA, dateG, string, string2, jSONObjectJ, this.f42849c.l(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)), this.f42849c.k(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    if (cursorB.isNull(iE8)) {
                        dVar.t(null);
                    } else {
                        dVar.t(Long.valueOf(cursorB.getLong(iE8)));
                    }
                    int i12 = iE2;
                    dVar.v(this.f42849c.e(cursorB.getInt(iE9)));
                    dVar.r(cursorB.getInt(iE10) != 0);
                    Date dateG2 = this.f42849c.g(cursorB.isNull(iE11) ? null : Long.valueOf(cursorB.getLong(iE11)));
                    if (dateG2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    dVar.s(dateG2);
                    int i13 = i10;
                    dVar.w(cursorB.getInt(i13));
                    int i14 = iE13;
                    dVar.q(cursorB.getInt(i14));
                    arrayList.add(dVar);
                    i10 = i13;
                    iE13 = i14;
                    iE = i11;
                    iE2 = i12;
                    str = str;
                }
                cursorB.close();
                tVar.e();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                tVar.e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
    }

    @Override // p140hd.e
    protected p158id.a k(UUID updateId) throws Throwable {
        t tVar;
        p158id.a aVar;
        Intrinsics.checkNotNullParameter(updateId, "updateId");
        t tVarA = t.f47930i.a("SELECT assets.* FROM assets INNER JOIN updates ON updates.launch_asset_id = assets.id WHERE updates.id = ?;", 1);
        tVarA.R2(1, this.f42849c.n(updateId));
        this.f42847a.d();
        Cursor cursorB = p219m3.b.b(this.f42847a, tVarA, false, null);
        try {
            int iE = p219m3.a.e(cursorB, "key");
            int iE2 = p219m3.a.e(cursorB, "type");
            int iE3 = p219m3.a.e(cursorB, "id");
            int iE4 = p219m3.a.e(cursorB, "url");
            int iE5 = p219m3.a.e(cursorB, "headers");
            int iE6 = p219m3.a.e(cursorB, "extra_request_headers");
            int iE7 = p219m3.a.e(cursorB, "metadata");
            int iE8 = p219m3.a.e(cursorB, "download_time");
            int iE9 = p219m3.a.e(cursorB, "relative_path");
            int iE10 = p219m3.a.e(cursorB, "hash");
            int iE11 = p219m3.a.e(cursorB, "hash_type");
            int iE12 = p219m3.a.e(cursorB, "expected_hash");
            int iE13 = p219m3.a.e(cursorB, "marked_for_deletion");
            if (cursorB.moveToFirst()) {
                tVar = tVarA;
                try {
                    p158id.a aVar2 = new p158id.a(cursorB.isNull(iE) ? null : cursorB.getString(iE), cursorB.isNull(iE2) ? null : cursorB.getString(iE2));
                    aVar2.B(cursorB.getLong(iE3));
                    aVar2.K(this.f42849c.l(cursorB.isNull(iE4) ? null : cursorB.getString(iE4)));
                    aVar2.A(this.f42849c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5)));
                    aVar2.x(this.f42849c.j(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)));
                    aVar2.E(this.f42849c.j(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    aVar2.u(this.f42849c.g(cursorB.isNull(iE8) ? null : Long.valueOf(cursorB.getLong(iE8))));
                    if (cursorB.isNull(iE9)) {
                        aVar2.F(null);
                    } else {
                        aVar2.F(cursorB.getString(iE9));
                    }
                    if (cursorB.isNull(iE10)) {
                        aVar2.y(null);
                    } else {
                        aVar2.y(cursorB.getBlob(iE10));
                    }
                    aVar2.z(this.f42849c.d(cursorB.getInt(iE11)));
                    if (cursorB.isNull(iE12)) {
                        aVar2.w(null);
                    } else {
                        aVar2.w(cursorB.getString(iE12));
                    }
                    aVar2.D(cursorB.getInt(iE13) != 0);
                    aVar = aVar2;
                } catch (Throwable th) {
                    th = th;
                    cursorB.close();
                    tVar.e();
                    throw th;
                }
            } else {
                tVar = tVarA;
                aVar = null;
            }
            cursorB.close();
            tVar.e();
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
    }

    @Override // p140hd.e
    protected List l(String scopeKey, List statuses) throws Throwable {
        t tVar;
        String str = "getString(...)";
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        StringBuilder sbB = p219m3.d.b();
        sbB.append("SELECT * FROM updates WHERE scope_key = ");
        sbB.append("?");
        sbB.append(" AND (successful_launch_count > 0 OR failed_launch_count < 1) AND status IN (");
        int size = statuses.size();
        p219m3.d.a(sbB, size);
        sbB.append(");");
        String string = sbB.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        t tVarA = t.f47930i.a(string, size + 1);
        tVarA.n2(1, scopeKey);
        Iterator it = statuses.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            tVarA.N2(i10, this.f42849c.h((p175jd.b) it.next()));
            i10++;
        }
        this.f42847a.d();
        Cursor cursorB = p219m3.b.b(this.f42847a, tVarA, false, null);
        try {
            int iE = p219m3.a.e(cursorB, "id");
            int iE2 = p219m3.a.e(cursorB, "commit_time");
            int iE3 = p219m3.a.e(cursorB, "runtime_version");
            int iE4 = p219m3.a.e(cursorB, "scope_key");
            int iE5 = p219m3.a.e(cursorB, "manifest");
            int iE6 = p219m3.a.e(cursorB, "url");
            int iE7 = p219m3.a.e(cursorB, "headers");
            int iE8 = p219m3.a.e(cursorB, "launch_asset_id");
            int iE9 = p219m3.a.e(cursorB, "status");
            int iE10 = p219m3.a.e(cursorB, "keep");
            int iE11 = p219m3.a.e(cursorB, "last_accessed");
            int iE12 = p219m3.a.e(cursorB, "successful_launch_count");
            tVar = tVarA;
            try {
                int iE13 = p219m3.a.e(cursorB, "failed_launch_count");
                int i11 = iE12;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    byte[] blob = cursorB.getBlob(iE);
                    int i12 = iE;
                    Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                    UUID uuidA = this.f42849c.a(blob);
                    Date dateG = this.f42849c.g(cursorB.isNull(iE2) ? null : Long.valueOf(cursorB.getLong(iE2)));
                    if (dateG == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    String string2 = cursorB.getString(iE3);
                    Intrinsics.checkNotNullExpressionValue(string2, str);
                    String string3 = cursorB.getString(iE4);
                    Intrinsics.checkNotNullExpressionValue(string3, str);
                    JSONObject jSONObjectJ = this.f42849c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5));
                    if (jSONObjectJ == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.");
                    }
                    p158id.d dVar = new p158id.d(uuidA, dateG, string2, string3, jSONObjectJ, this.f42849c.l(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)), this.f42849c.k(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    if (cursorB.isNull(iE8)) {
                        dVar.t(null);
                    } else {
                        dVar.t(Long.valueOf(cursorB.getLong(iE8)));
                    }
                    int i13 = iE2;
                    dVar.v(this.f42849c.e(cursorB.getInt(iE9)));
                    dVar.r(cursorB.getInt(iE10) != 0);
                    Date dateG2 = this.f42849c.g(cursorB.isNull(iE11) ? null : Long.valueOf(cursorB.getLong(iE11)));
                    if (dateG2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    dVar.s(dateG2);
                    int i14 = i11;
                    dVar.w(cursorB.getInt(i14));
                    int i15 = iE13;
                    dVar.q(cursorB.getInt(i15));
                    arrayList.add(dVar);
                    i11 = i14;
                    iE13 = i15;
                    iE = i12;
                    iE2 = i13;
                    str = str;
                }
                cursorB.close();
                tVar.e();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                tVar.e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
    }

    @Override // p140hd.e
    public List n() {
        t tVarA = t.f47930i.a("SELECT id FROM updates WHERE failed_launch_count > 0 ORDER BY commit_time DESC LIMIT 5;", 0);
        this.f42847a.d();
        Cursor cursorB = p219m3.b.b(this.f42847a, tVarA, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                byte[] blob = cursorB.getBlob(0);
                Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                arrayList.add(this.f42849c.a(blob));
            }
            cursorB.close();
            tVarA.e();
            return arrayList;
        } catch (Throwable th) {
            cursorB.close();
            tVarA.e();
            throw th;
        }
    }

    @Override // p140hd.e
    protected List p(UUID id2) throws Throwable {
        t tVar;
        String str = "getString(...)";
        Intrinsics.checkNotNullParameter(id2, "id");
        t tVarA = t.f47930i.a("SELECT * FROM updates WHERE id = ?;", 1);
        tVarA.R2(1, this.f42849c.n(id2));
        this.f42847a.d();
        Cursor cursorB = p219m3.b.b(this.f42847a, tVarA, false, null);
        try {
            int iE = p219m3.a.e(cursorB, "id");
            int iE2 = p219m3.a.e(cursorB, "commit_time");
            int iE3 = p219m3.a.e(cursorB, "runtime_version");
            int iE4 = p219m3.a.e(cursorB, "scope_key");
            int iE5 = p219m3.a.e(cursorB, "manifest");
            int iE6 = p219m3.a.e(cursorB, "url");
            int iE7 = p219m3.a.e(cursorB, "headers");
            int iE8 = p219m3.a.e(cursorB, "launch_asset_id");
            int iE9 = p219m3.a.e(cursorB, "status");
            int iE10 = p219m3.a.e(cursorB, "keep");
            int iE11 = p219m3.a.e(cursorB, "last_accessed");
            int iE12 = p219m3.a.e(cursorB, "successful_launch_count");
            tVar = tVarA;
            try {
                int iE13 = p219m3.a.e(cursorB, "failed_launch_count");
                int i10 = iE12;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    byte[] blob = cursorB.getBlob(iE);
                    int i11 = iE;
                    Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
                    UUID uuidA = this.f42849c.a(blob);
                    Date dateG = this.f42849c.g(cursorB.isNull(iE2) ? null : Long.valueOf(cursorB.getLong(iE2)));
                    if (dateG == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    String string = cursorB.getString(iE3);
                    Intrinsics.checkNotNullExpressionValue(string, str);
                    int i12 = iE2;
                    String string2 = cursorB.getString(iE4);
                    Intrinsics.checkNotNullExpressionValue(string2, str);
                    JSONObject jSONObjectJ = this.f42849c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5));
                    if (jSONObjectJ == null) {
                        throw new IllegalStateException("Expected NON-NULL 'org.json.JSONObject', but it was NULL.");
                    }
                    p158id.d dVar = new p158id.d(uuidA, dateG, string, string2, jSONObjectJ, this.f42849c.l(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)), this.f42849c.k(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    if (cursorB.isNull(iE8)) {
                        dVar.t(null);
                    } else {
                        dVar.t(Long.valueOf(cursorB.getLong(iE8)));
                    }
                    dVar.v(this.f42849c.e(cursorB.getInt(iE9)));
                    dVar.r(cursorB.getInt(iE10) != 0);
                    Date dateG2 = this.f42849c.g(cursorB.isNull(iE11) ? null : Long.valueOf(cursorB.getLong(iE11)));
                    if (dateG2 == null) {
                        throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                    }
                    dVar.s(dateG2);
                    int i13 = i10;
                    dVar.w(cursorB.getInt(i13));
                    int i14 = iE13;
                    dVar.q(cursorB.getInt(i14));
                    arrayList.add(dVar);
                    i10 = i13;
                    iE13 = i14;
                    iE = i11;
                    iE2 = i12;
                    str = str;
                }
                cursorB.close();
                tVar.e();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                tVar.e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
    }

    @Override // p140hd.e
    protected void r(UUID id2, Date lastAccessed) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(lastAccessed, "lastAccessed");
        this.f42847a.d();
        k kVarB = this.f42855i.b();
        Long lB = this.f42849c.b(lastAccessed);
        if (lB == null) {
            kVarB.q3(1);
        } else {
            kVarB.N2(1, lB.longValue());
        }
        kVarB.R2(2, this.f42849c.n(id2));
        try {
            this.f42847a.e();
            try {
                kVarB.n0();
                this.f42847a.z();
                this.f42847a.i();
                this.f42855i.h(kVarB);
            } catch (Throwable th) {
                this.f42847a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42855i.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.e
    public void t(p158id.d update, boolean z10) {
        Intrinsics.checkNotNullParameter(update, "update");
        this.f42847a.e();
        try {
            super.t(update, z10);
            this.f42847a.z();
        } finally {
            this.f42847a.i();
        }
    }

    @Override // p140hd.e
    protected void u(p175jd.b status, UUID id2) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f42847a.d();
        k kVarB = this.f42852f.b();
        kVarB.N2(1, this.f42849c.h(status));
        kVarB.R2(2, this.f42849c.n(id2));
        try {
            this.f42847a.e();
            try {
                kVarB.n0();
                this.f42847a.z();
                this.f42847a.i();
                this.f42852f.h(kVarB);
            } catch (Throwable th) {
                this.f42847a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42852f.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.e
    public void w(UUID id2, Date commitTime) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(commitTime, "commitTime");
        this.f42847a.d();
        k kVarB = this.f42854h.b();
        Long lB = this.f42849c.b(commitTime);
        if (lB == null) {
            kVarB.q3(1);
        } else {
            kVarB.N2(1, lB.longValue());
        }
        kVarB.R2(2, this.f42849c.n(id2));
        try {
            this.f42847a.e();
            try {
                kVarB.n0();
                this.f42847a.z();
                this.f42847a.i();
                this.f42854h.h(kVarB);
            } catch (Throwable th) {
                this.f42847a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42854h.h(kVarB);
            throw th2;
        }
    }
}
