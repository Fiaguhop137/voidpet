package Wf;

import Vf.c;
import Vf.d;

/* JADX INFO: loaded from: classes3.dex */
public class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f15082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f15083d;

    public a(String str, int i10) {
        this(str, i10, null, d.ANY);
    }

    public a(String str, int i10, Object obj, d dVar) {
        this.f15080a = str;
        this.f15081b = i10;
        this.f15082c = obj;
        if (obj instanceof d) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        this.f15083d = dVar;
    }

    @Override // Vf.c
    public String a() {
        return this.f15080a;
    }
}
