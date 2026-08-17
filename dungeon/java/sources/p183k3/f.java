package p183k3;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import p291q3.h;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.c f47849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.d f47850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f47851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.c f47853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f47854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f47855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f47856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f47857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f47858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f47859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f47860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f47861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f47862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f47863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f47864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f47865s;

    public f(Context context, String str, h.c sqliteOpenHelperFactory, q.d migrationContainer, List list, boolean z10, q.c journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, q.e eVar, List typeConverters, List autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f47847a = context;
        this.f47848b = str;
        this.f47849c = sqliteOpenHelperFactory;
        this.f47850d = migrationContainer;
        this.f47851e = list;
        this.f47852f = z10;
        this.f47853g = journalMode;
        this.f47854h = queryExecutor;
        this.f47855i = transactionExecutor;
        this.f47856j = intent;
        this.f47857k = z11;
        this.f47858l = z12;
        this.f47859m = set;
        this.f47860n = str2;
        this.f47861o = file;
        this.f47862p = callable;
        this.f47863q = typeConverters;
        this.f47864r = autoMigrationSpecs;
        this.f47865s = intent != null;
    }

    public boolean a(int i10, int i11) {
        Set set;
        return (i10 <= i11 || !this.f47858l) && this.f47857k && ((set = this.f47859m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
