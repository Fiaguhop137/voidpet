package p382v4;

import L4.k;
import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;
import p274p4.f;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f56230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f56231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f56232c;

        public a(f fVar, d dVar) {
            this(fVar, Collections.EMPTY_LIST, dVar);
        }

        public a(f fVar, List list, d dVar) {
            this.f56230a = (f) k.d(fVar);
            this.f56231b = (List) k.d(list);
            this.f56232c = (d) k.d(dVar);
        }
    }

    a a(Object obj, int i10, int i11, h hVar);

    boolean b(Object obj);
}
