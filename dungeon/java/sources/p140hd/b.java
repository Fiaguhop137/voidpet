package p140hd;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p183k3.q;
import p183k3.t;
import p183k3.w;
import p291q3.k;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends p140hd.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j f42818l = new j(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f42819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p183k3.i f42820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p122gd.b f42821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p183k3.i f42822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p183k3.h f42823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f42824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f42825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f42826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w f42827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f42828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w f42829k;

    public static final class a extends p183k3.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f42830d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, b bVar) {
            super(qVar);
            this.f42830d = bVar;
        }

        @Override // p183k3.w
        protected String e() {
            return "INSERT OR REPLACE INTO `assets` (`key`,`type`,`id`,`url`,`headers`,`extra_request_headers`,`metadata`,`download_time`,`relative_path`,`hash`,`hash_type`,`expected_hash`,`marked_for_deletion`) VALUES (?,?,nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p183k3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, p158id.a entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            String strJ = entity.j();
            if (strJ == null) {
                statement.q3(1);
            } else {
                statement.n2(1, strJ);
            }
            String strR = entity.r();
            if (strR == null) {
                statement.q3(2);
            } else {
                statement.n2(2, strR);
            }
            statement.N2(3, entity.i());
            String strM = this.f42830d.f42821c.m(entity.s());
            if (strM == null) {
                statement.q3(4);
            } else {
                statement.n2(4, strM);
            }
            String strF = this.f42830d.f42821c.f(entity.h());
            if (strF == null) {
                statement.q3(5);
            } else {
                statement.n2(5, strF);
            }
            String strF2 = this.f42830d.f42821c.f(entity.d());
            if (strF2 == null) {
                statement.q3(6);
            } else {
                statement.n2(6, strF2);
            }
            String strF3 = this.f42830d.f42821c.f(entity.l());
            if (strF3 == null) {
                statement.q3(7);
            } else {
                statement.n2(7, strF3);
            }
            Long lB = this.f42830d.f42821c.b(entity.a());
            if (lB == null) {
                statement.q3(8);
            } else {
                statement.N2(8, lB.longValue());
            }
            String strM2 = entity.m();
            if (strM2 == null) {
                statement.q3(9);
            } else {
                statement.n2(9, strM2);
            }
            byte[] bArrF = entity.f();
            if (bArrF == null) {
                statement.q3(10);
            } else {
                statement.R2(10, bArrF);
            }
            statement.N2(11, this.f42830d.f42821c.c(entity.g()));
            String strC = entity.c();
            if (strC == null) {
                statement.q3(12);
            } else {
                statement.n2(12, strC);
            }
            statement.N2(13, entity.k() ? 1L : 0L);
        }
    }

    /* JADX INFO: renamed from: hd.b$b, reason: collision with other inner class name */
    public static final class C0500b extends p183k3.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f42831d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0500b(q qVar, b bVar) {
            super(qVar);
            this.f42831d = bVar;
        }

        @Override // p183k3.w
        protected String e() {
            return "INSERT OR REPLACE INTO `updates_assets` (`update_id`,`asset_id`) VALUES (?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p183k3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, p158id.c entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.R2(1, this.f42831d.f42821c.n(entity.b()));
            statement.N2(2, entity.a());
        }
    }

    public static final class c extends p183k3.h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f42832d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q qVar, b bVar) {
            super(qVar);
            this.f42832d = bVar;
        }

        @Override // p183k3.w
        protected String e() {
            return "UPDATE OR ABORT `assets` SET `key` = ?,`type` = ?,`id` = ?,`url` = ?,`headers` = ?,`extra_request_headers` = ?,`metadata` = ?,`download_time` = ?,`relative_path` = ?,`hash` = ?,`hash_type` = ?,`expected_hash` = ?,`marked_for_deletion` = ? WHERE `id` = ?";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p183k3.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, p158id.a entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            String strJ = entity.j();
            if (strJ == null) {
                statement.q3(1);
            } else {
                statement.n2(1, strJ);
            }
            String strR = entity.r();
            if (strR == null) {
                statement.q3(2);
            } else {
                statement.n2(2, strR);
            }
            statement.N2(3, entity.i());
            String strM = this.f42832d.f42821c.m(entity.s());
            if (strM == null) {
                statement.q3(4);
            } else {
                statement.n2(4, strM);
            }
            String strF = this.f42832d.f42821c.f(entity.h());
            if (strF == null) {
                statement.q3(5);
            } else {
                statement.n2(5, strF);
            }
            String strF2 = this.f42832d.f42821c.f(entity.d());
            if (strF2 == null) {
                statement.q3(6);
            } else {
                statement.n2(6, strF2);
            }
            String strF3 = this.f42832d.f42821c.f(entity.l());
            if (strF3 == null) {
                statement.q3(7);
            } else {
                statement.n2(7, strF3);
            }
            Long lB = this.f42832d.f42821c.b(entity.a());
            if (lB == null) {
                statement.q3(8);
            } else {
                statement.N2(8, lB.longValue());
            }
            String strM2 = entity.m();
            if (strM2 == null) {
                statement.q3(9);
            } else {
                statement.n2(9, strM2);
            }
            byte[] bArrF = entity.f();
            if (bArrF == null) {
                statement.q3(10);
            } else {
                statement.R2(10, bArrF);
            }
            statement.N2(11, this.f42832d.f42821c.c(entity.g()));
            String strC = entity.c();
            if (strC == null) {
                statement.q3(12);
            } else {
                statement.n2(12, strC);
            }
            statement.N2(13, entity.k() ? 1L : 0L);
            statement.N2(14, entity.i());
        }
    }

    public static final class d extends w {
        d(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE updates SET launch_asset_id = ? WHERE id = ?;";
        }
    }

    public static final class e extends w {
        e(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE assets SET marked_for_deletion = 1;";
        }
    }

    public static final class f extends w {
        f(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE assets SET marked_for_deletion = 0 WHERE id IN ( SELECT asset_id FROM updates_assets INNER JOIN updates ON updates_assets.update_id = updates.id WHERE updates.keep);";
        }
    }

    public static final class g extends w {
        g(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE assets SET marked_for_deletion = 0 WHERE id IN ( SELECT launch_asset_id FROM updates WHERE updates.keep);";
        }
    }

    public static final class h extends w {
        h(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "UPDATE assets SET marked_for_deletion = 0 WHERE relative_path IN ( SELECT relative_path FROM assets WHERE marked_for_deletion = 0);";
        }
    }

    public static final class i extends w {
        i(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "DELETE FROM assets WHERE marked_for_deletion = 1;";
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

    public b(q __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f42821c = new p122gd.b();
        this.f42819a = __db;
        this.f42820b = new a(__db, this);
        this.f42822d = new C0500b(__db, this);
        this.f42823e = new c(__db, this);
        this.f42824f = new d(__db);
        this.f42825g = new e(__db);
        this.f42826h = new f(__db);
        this.f42827i = new g(__db);
        this.f42828j = new h(__db);
        this.f42829k = new i(__db);
    }

    @Override // p140hd.a
    public boolean a(p158id.d update, p158id.a asset, boolean z10) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f42819a.e();
        try {
            boolean zA = super.a(update, asset, z10);
            this.f42819a.z();
            return zA;
        } finally {
            this.f42819a.i();
        }
    }

    @Override // p140hd.a
    protected void b() {
        this.f42819a.d();
        k kVarB = this.f42829k.b();
        try {
            this.f42819a.e();
            try {
                kVarB.n0();
                this.f42819a.z();
                this.f42819a.i();
                this.f42829k.h(kVarB);
            } catch (Throwable th) {
                this.f42819a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42829k.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.a
    public List c() {
        this.f42819a.e();
        try {
            List listC = super.c();
            this.f42819a.z();
            return listC;
        } finally {
            this.f42819a.i();
        }
    }

    @Override // p140hd.a
    protected long d(p158id.a asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f42819a.d();
        this.f42819a.e();
        try {
            long jK = this.f42820b.k(asset);
            this.f42819a.z();
            return jK;
        } finally {
            this.f42819a.i();
        }
    }

    @Override // p140hd.a
    public void e(List assets, p158id.d update) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(update, "update");
        this.f42819a.e();
        try {
            super.e(assets, update);
            this.f42819a.z();
        } finally {
            this.f42819a.i();
        }
    }

    @Override // p140hd.a
    protected void f(p158id.c updateAsset) {
        Intrinsics.checkNotNullParameter(updateAsset, "updateAsset");
        this.f42819a.d();
        this.f42819a.e();
        try {
            this.f42822d.j(updateAsset);
            this.f42819a.z();
        } finally {
            this.f42819a.i();
        }
    }

    @Override // p140hd.a
    protected List h(String str) throws Throwable {
        t tVar;
        t tVarA = t.f47930i.a("SELECT * FROM assets WHERE `key` = ? LIMIT 1;", 1);
        if (str == null) {
            tVarA.q3(1);
        } else {
            tVarA.n2(1, str);
        }
        this.f42819a.d();
        Cursor cursorB = p219m3.b.b(this.f42819a, tVarA, false, null);
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
            tVar = tVarA;
            try {
                int iE13 = p219m3.a.e(cursorB, "marked_for_deletion");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    int i10 = iE2;
                    p158id.a aVar = new p158id.a(cursorB.isNull(iE) ? null : cursorB.getString(iE), cursorB.isNull(iE2) ? null : cursorB.getString(iE2));
                    int i11 = iE12;
                    aVar.B(cursorB.getLong(iE3));
                    aVar.K(this.f42821c.l(cursorB.isNull(iE4) ? null : cursorB.getString(iE4)));
                    aVar.A(this.f42821c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5)));
                    aVar.x(this.f42821c.j(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)));
                    aVar.E(this.f42821c.j(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    aVar.u(this.f42821c.g(cursorB.isNull(iE8) ? null : Long.valueOf(cursorB.getLong(iE8))));
                    if (cursorB.isNull(iE9)) {
                        aVar.F(null);
                    } else {
                        aVar.F(cursorB.getString(iE9));
                    }
                    if (cursorB.isNull(iE10)) {
                        aVar.y(null);
                    } else {
                        aVar.y(cursorB.getBlob(iE10));
                    }
                    aVar.z(this.f42821c.d(cursorB.getInt(iE11)));
                    if (cursorB.isNull(i11)) {
                        aVar.w(null);
                    } else {
                        aVar.w(cursorB.getString(i11));
                    }
                    int i12 = iE13;
                    aVar.D(cursorB.getInt(i12) != 0);
                    arrayList.add(aVar);
                    iE12 = i11;
                    iE13 = i12;
                    iE2 = i10;
                    iE = iE;
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

    @Override // p140hd.a
    public List i(UUID id2) throws Throwable {
        t tVar;
        Intrinsics.checkNotNullParameter(id2, "id");
        t tVarA = t.f47930i.a("SELECT assets.* FROM assets INNER JOIN updates_assets ON updates_assets.asset_id = assets.id INNER JOIN updates ON updates_assets.update_id = updates.id WHERE updates.id = ?;", 1);
        tVarA.R2(1, this.f42821c.n(id2));
        this.f42819a.d();
        Cursor cursorB = p219m3.b.b(this.f42819a, tVarA, false, null);
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
            tVar = tVarA;
            try {
                int iE13 = p219m3.a.e(cursorB, "marked_for_deletion");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    int i10 = iE2;
                    p158id.a aVar = new p158id.a(cursorB.isNull(iE) ? null : cursorB.getString(iE), cursorB.isNull(iE2) ? null : cursorB.getString(iE2));
                    int i11 = iE12;
                    aVar.B(cursorB.getLong(iE3));
                    aVar.K(this.f42821c.l(cursorB.isNull(iE4) ? null : cursorB.getString(iE4)));
                    aVar.A(this.f42821c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5)));
                    aVar.x(this.f42821c.j(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)));
                    aVar.E(this.f42821c.j(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    aVar.u(this.f42821c.g(cursorB.isNull(iE8) ? null : Long.valueOf(cursorB.getLong(iE8))));
                    if (cursorB.isNull(iE9)) {
                        aVar.F(null);
                    } else {
                        aVar.F(cursorB.getString(iE9));
                    }
                    if (cursorB.isNull(iE10)) {
                        aVar.y(null);
                    } else {
                        aVar.y(cursorB.getBlob(iE10));
                    }
                    aVar.z(this.f42821c.d(cursorB.getInt(iE11)));
                    if (cursorB.isNull(i11)) {
                        aVar.w(null);
                    } else {
                        aVar.w(cursorB.getString(i11));
                    }
                    int i12 = iE13;
                    aVar.D(cursorB.getInt(i12) != 0);
                    arrayList.add(aVar);
                    iE12 = i11;
                    iE13 = i12;
                    iE2 = i10;
                    iE = iE;
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

    @Override // p140hd.a
    protected List j() throws Throwable {
        t tVar;
        t tVarA = t.f47930i.a("SELECT * FROM assets WHERE marked_for_deletion = 1;", 0);
        this.f42819a.d();
        Cursor cursorB = p219m3.b.b(this.f42819a, tVarA, false, null);
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
            tVar = tVarA;
            try {
                int iE13 = p219m3.a.e(cursorB, "marked_for_deletion");
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    int i10 = iE2;
                    p158id.a aVar = new p158id.a(cursorB.isNull(iE) ? null : cursorB.getString(iE), cursorB.isNull(iE2) ? null : cursorB.getString(iE2));
                    ArrayList arrayList2 = arrayList;
                    int i11 = iE12;
                    aVar.B(cursorB.getLong(iE3));
                    aVar.K(this.f42821c.l(cursorB.isNull(iE4) ? null : cursorB.getString(iE4)));
                    aVar.A(this.f42821c.j(cursorB.isNull(iE5) ? null : cursorB.getString(iE5)));
                    aVar.x(this.f42821c.j(cursorB.isNull(iE6) ? null : cursorB.getString(iE6)));
                    aVar.E(this.f42821c.j(cursorB.isNull(iE7) ? null : cursorB.getString(iE7)));
                    aVar.u(this.f42821c.g(cursorB.isNull(iE8) ? null : Long.valueOf(cursorB.getLong(iE8))));
                    if (cursorB.isNull(iE9)) {
                        aVar.F(null);
                    } else {
                        aVar.F(cursorB.getString(iE9));
                    }
                    if (cursorB.isNull(iE10)) {
                        aVar.y(null);
                    } else {
                        aVar.y(cursorB.getBlob(iE10));
                    }
                    aVar.z(this.f42821c.d(cursorB.getInt(iE11)));
                    if (cursorB.isNull(i11)) {
                        aVar.w(null);
                    } else {
                        aVar.w(cursorB.getString(i11));
                    }
                    int i12 = iE13;
                    aVar.D(cursorB.getInt(i12) != 0);
                    arrayList2.add(aVar);
                    iE13 = i12;
                    arrayList = arrayList2;
                    iE2 = i10;
                    iE12 = i11;
                    iE = iE;
                }
                ArrayList arrayList3 = arrayList;
                cursorB.close();
                tVar.e();
                return arrayList3;
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

    @Override // p140hd.a
    protected void k() {
        this.f42819a.d();
        k kVarB = this.f42825g.b();
        try {
            this.f42819a.e();
            try {
                kVarB.n0();
                this.f42819a.z();
                this.f42819a.i();
                this.f42825g.h(kVarB);
            } catch (Throwable th) {
                this.f42819a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42825g.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.a
    protected void m(long j10, UUID updateId) {
        Intrinsics.checkNotNullParameter(updateId, "updateId");
        this.f42819a.d();
        k kVarB = this.f42824f.b();
        kVarB.N2(1, j10);
        kVarB.R2(2, this.f42821c.n(updateId));
        try {
            this.f42819a.e();
            try {
                kVarB.n0();
                this.f42819a.z();
                this.f42819a.i();
                this.f42824f.h(kVarB);
            } catch (Throwable th) {
                this.f42819a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42824f.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.a
    protected void n() {
        this.f42819a.d();
        k kVarB = this.f42828j.b();
        try {
            this.f42819a.e();
            try {
                kVarB.n0();
                this.f42819a.z();
                this.f42819a.i();
                this.f42828j.h(kVarB);
            } catch (Throwable th) {
                this.f42819a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42828j.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.a
    protected void o() {
        this.f42819a.d();
        k kVarB = this.f42826h.b();
        try {
            this.f42819a.e();
            try {
                kVarB.n0();
                this.f42819a.z();
                this.f42819a.i();
                this.f42826h.h(kVarB);
            } catch (Throwable th) {
                this.f42819a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42826h.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.a
    protected void p() {
        this.f42819a.d();
        k kVarB = this.f42827i.b();
        try {
            this.f42819a.e();
            try {
                kVarB.n0();
                this.f42819a.z();
                this.f42819a.i();
                this.f42827i.h(kVarB);
            } catch (Throwable th) {
                this.f42819a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42827i.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.a
    public void q(p158id.a assetEntity) {
        Intrinsics.checkNotNullParameter(assetEntity, "assetEntity");
        this.f42819a.d();
        this.f42819a.e();
        try {
            this.f42823e.j(assetEntity);
            this.f42819a.z();
        } finally {
            this.f42819a.i();
        }
    }
}
