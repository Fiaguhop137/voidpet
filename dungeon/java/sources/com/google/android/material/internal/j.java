package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f36776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f36777d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p243n9.d f36780g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f36774a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p243n9.f f36775b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36778e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f36779f = new WeakReference(null);

    class a extends p243n9.f {
        a() {
        }

        @Override // p243n9.f
        public void a(int i10) {
            j.this.f36778e = true;
            b bVar = (b) j.this.f36779f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // p243n9.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            j.this.f36778e = true;
            b bVar = (b) j.this.f36779f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f36774a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f36774a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f36776c = d(str);
        this.f36777d = c(str);
        this.f36778e = false;
    }

    public p243n9.d e() {
        return this.f36780g;
    }

    public float f(String str) {
        if (!this.f36778e) {
            return this.f36777d;
        }
        i(str);
        return this.f36777d;
    }

    public TextPaint g() {
        return this.f36774a;
    }

    public float h(String str) {
        if (!this.f36778e) {
            return this.f36776c;
        }
        i(str);
        return this.f36776c;
    }

    public void j(b bVar) {
        this.f36779f = new WeakReference(bVar);
    }

    public void k(p243n9.d dVar, Context context) {
        if (this.f36780g != dVar) {
            this.f36780g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f36774a, this.f36775b);
                b bVar = (b) this.f36779f.get();
                if (bVar != null) {
                    this.f36774a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f36774a, this.f36775b);
                this.f36778e = true;
            }
            b bVar2 = (b) this.f36779f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f36778e = z10;
    }

    public void m(boolean z10) {
        this.f36778e = z10;
    }

    public void n(Context context) {
        this.f36780g.n(context, this.f36774a, this.f36775b);
    }
}
