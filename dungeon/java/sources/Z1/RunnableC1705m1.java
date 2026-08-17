package Z1;

import android.util.Pair;
import java.io.IOException;
import p236n2.C4027y;

/* JADX INFO: renamed from: Z1.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1705m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1.a f18367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pair f18368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4027y f18369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p236n2.B f18370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IOException f18371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f18372f;

    public /* synthetic */ RunnableC1705m1(o1.a aVar, Pair pair, C4027y c4027y, p236n2.B b10, IOException iOException, boolean z10) {
        this.f18367a = aVar;
        this.f18368b = pair;
        this.f18369c = c4027y;
        this.f18370d = b10;
        this.f18371e = iOException;
        this.f18372f = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o1.a aVar = this.f18367a;
        Pair pair = this.f18368b;
        o1.this.f18403h.R(((Integer) pair.first).intValue(), (n2.D.b) pair.second, this.f18369c, this.f18370d, this.f18371e, this.f18372f);
    }
}
