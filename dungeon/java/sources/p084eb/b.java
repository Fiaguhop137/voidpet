package p084eb;

import android.app.Activity;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p227mb.d;
import p227mb.e;
import p227mb.f;
import p245nb.c;

/* JADX INFO: loaded from: classes2.dex */
public class b implements p227mb.a, d, e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReactContext f40723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f40724b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f40725c = new WeakHashMap();

    class a implements LifecycleEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f40726a;

        a(WeakReference weakReference) {
            this.f40726a = weakReference;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            f fVar = (f) this.f40726a.get();
            if (fVar != null) {
                fVar.onHostDestroy();
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            f fVar = (f) this.f40726a.get();
            if (fVar != null) {
                fVar.onHostPause();
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            f fVar = (f) this.f40726a.get();
            if (fVar != null) {
                fVar.onHostResume();
            }
        }
    }

    public b(ReactContext reactContext) {
        this.f40723a = reactContext;
    }

    @Override // p227mb.a
    public Activity a() {
        return c().getCurrentActivity();
    }

    @Override // p245nb.c
    public void b(f fVar) {
        this.f40724b.put(fVar, new a(new WeakReference(fVar)));
        this.f40723a.addLifecycleEventListener((LifecycleEventListener) this.f40724b.get(fVar));
    }

    protected ReactContext c() {
        return this.f40723a;
    }

    @Override // p227mb.k
    public void d() {
        Iterator it = new ArrayList(this.f40724b.values()).iterator();
        while (it.hasNext()) {
            ((LifecycleEventListener) it.next()).onHostDestroy();
        }
        Iterator it2 = this.f40724b.values().iterator();
        while (it2.hasNext()) {
            this.f40723a.removeLifecycleEventListener((LifecycleEventListener) it2.next());
        }
        this.f40724b.clear();
    }

    @Override // p227mb.d
    public List h() {
        return Arrays.asList(p227mb.a.class, e.class, c.class);
    }
}
