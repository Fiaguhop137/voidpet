package p119ga;

import java.io.IOException;
import java.io.StringWriter;
import p155ia.m;
import p262oa.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public e a() {
        if (g()) {
            return (e) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public i c() {
        if (i()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public k e() {
        if (j()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean g() {
        return this instanceof e;
    }

    public boolean h() {
        return this instanceof h;
    }

    public boolean i() {
        return this instanceof i;
    }

    public boolean j() {
        return this instanceof k;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.Q(true);
            m.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
