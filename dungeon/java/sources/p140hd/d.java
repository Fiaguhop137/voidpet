package p140hd;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p183k3.i;
import p183k3.q;
import p183k3.t;
import p183k3.w;
import p291q3.k;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends p140hd.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f42840e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f42841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f42842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p122gd.b f42843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f42844d;

    public static final class a extends i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f42845d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q qVar, d dVar) {
            super(qVar);
            this.f42845d = dVar;
        }

        @Override // p183k3.w
        protected String e() {
            return "INSERT OR ABORT INTO `json_data` (`key`,`value`,`last_updated`,`scope_key`,`id`) VALUES (?,?,?,?,nullif(?, 0))";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p183k3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(k statement, p158id.b entity) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            Intrinsics.checkNotNullParameter(entity, "entity");
            statement.n2(1, entity.b());
            statement.n2(2, entity.e());
            Long lB = this.f42845d.f42843c.b(entity.c());
            if (lB == null) {
                statement.q3(3);
            } else {
                statement.N2(3, lB.longValue());
            }
            statement.n2(4, entity.d());
            statement.N2(5, entity.a());
        }
    }

    public static final class b extends w {
        b(q qVar) {
            super(qVar);
        }

        @Override // p183k3.w
        public String e() {
            return "DELETE FROM json_data WHERE `key` = ? AND scope_key = ?;";
        }
    }

    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a() {
            return CollectionsKt.l();
        }
    }

    public d(q __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.f42843c = new p122gd.b();
        this.f42841a = __db;
        this.f42842b = new a(__db, this);
        this.f42844d = new b(__db);
    }

    @Override // p140hd.c
    protected void a(String key, String scopeKey) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        this.f42841a.d();
        k kVarB = this.f42844d.b();
        kVarB.n2(1, key);
        kVarB.n2(2, scopeKey);
        try {
            this.f42841a.e();
            try {
                kVarB.n0();
                this.f42841a.z();
                this.f42841a.i();
                this.f42844d.h(kVarB);
            } catch (Throwable th) {
                this.f42841a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f42844d.h(kVarB);
            throw th2;
        }
    }

    @Override // p140hd.c
    public void b(List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.f42841a.e();
        try {
            super.b(keys);
            this.f42841a.z();
        } finally {
            this.f42841a.i();
        }
    }

    @Override // p140hd.c
    protected void c(List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.f42841a.d();
        StringBuilder sbB = p219m3.d.b();
        sbB.append("DELETE FROM json_data WHERE `key` IN (");
        p219m3.d.a(sbB, keys.size());
        sbB.append(")");
        String string = sbB.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        k kVarF = this.f42841a.f(string);
        Iterator it = keys.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            kVarF.n2(i10, (String) it.next());
            i10++;
        }
        this.f42841a.e();
        try {
            kVarF.n0();
            this.f42841a.z();
        } finally {
            this.f42841a.i();
        }
    }

    @Override // p140hd.c
    protected void d(p158id.b jsonDataEntity) {
        Intrinsics.checkNotNullParameter(jsonDataEntity, "jsonDataEntity");
        this.f42841a.d();
        this.f42841a.e();
        try {
            this.f42842b.j(jsonDataEntity);
            this.f42841a.z();
        } finally {
            this.f42841a.i();
        }
    }

    @Override // p140hd.c
    protected List e(String key, String scopeKey) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        t tVarA = t.f47930i.a("SELECT * FROM json_data WHERE `key` = ? AND scope_key = ? ORDER BY last_updated DESC LIMIT 1;", 2);
        tVarA.n2(1, key);
        tVarA.n2(2, scopeKey);
        this.f42841a.d();
        Cursor cursorB = p219m3.b.b(this.f42841a, tVarA, false, null);
        try {
            int iE = p219m3.a.e(cursorB, "key");
            int iE2 = p219m3.a.e(cursorB, "value");
            int iE3 = p219m3.a.e(cursorB, "last_updated");
            int iE4 = p219m3.a.e(cursorB, "scope_key");
            int iE5 = p219m3.a.e(cursorB, "id");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                String string = cursorB.getString(iE);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = cursorB.getString(iE2);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                Date dateG = this.f42843c.g(cursorB.isNull(iE3) ? null : Long.valueOf(cursorB.getLong(iE3)));
                if (dateG == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                String string3 = cursorB.getString(iE4);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                p158id.b bVar = new p158id.b(string, string2, dateG, string3);
                bVar.f(cursorB.getLong(iE5));
                arrayList.add(bVar);
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

    @Override // p140hd.c
    public void g(hd.c.a key, String value, String scopeKey) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        this.f42841a.e();
        try {
            super.g(key, value, scopeKey);
            this.f42841a.z();
        } finally {
            this.f42841a.i();
        }
    }

    @Override // p140hd.c
    public void h(Map fields, String scopeKey) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        this.f42841a.e();
        try {
            super.h(fields, scopeKey);
            this.f42841a.z();
        } finally {
            this.f42841a.i();
        }
    }

    @Override // p140hd.c
    public void i(hd.c.a key, String scopeKey, Function1 updater) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(updater, "updater");
        this.f42841a.e();
        try {
            super.i(key, scopeKey, updater);
            this.f42841a.z();
        } finally {
            this.f42841a.i();
        }
    }
}
