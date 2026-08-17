package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f28572a;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f28573a = new HashMap();

        a() {
        }

        f b() {
            return new f(this);
        }
    }

    f(a aVar) {
        this.f28572a = Collections.unmodifiableMap(new HashMap(aVar.f28573a));
    }

    public boolean a(Class cls) {
        return this.f28572a.containsKey(cls);
    }
}
