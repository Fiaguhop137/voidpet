package kotlin.random;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends c {
    @Override // kotlin.random.c
    public int b(int i10) {
        return d.d(f().nextInt(), i10);
    }

    @Override // kotlin.random.c
    public int c() {
        return f().nextInt();
    }

    @Override // kotlin.random.c
    public int d(int i10) {
        return f().nextInt(i10);
    }

    public abstract Random f();
}
