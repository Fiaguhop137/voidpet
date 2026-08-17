package expo.modules.adapters.react;

import android.content.Context;
import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p227mb.g;

/* JADX INFO: loaded from: classes2.dex */
public class b extends p173jb.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f40886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection f40887c;

    public b(List list, List list2) {
        super(list);
        this.f40887c = list2;
    }

    private Collection d(Context context) {
        Collection collection = this.f40887c;
        if (collection != null) {
            return collection;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((g) it.next()).c(context));
        }
        return arrayList;
    }

    public p173jb.b b(Context context) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        for (g gVar : a()) {
            arrayList.addAll(gVar.f(context));
            if (gVar instanceof P) {
                cVar.a((P) gVar);
            }
        }
        arrayList.add(cVar);
        return new p173jb.b(arrayList, d(context));
    }

    public Collection c(ReactApplicationContext reactApplicationContext) {
        Collection collection = this.f40886b;
        if (collection != null) {
            return collection;
        }
        this.f40886b = new HashSet();
        for (g gVar : a()) {
            if (gVar instanceof P) {
                this.f40886b.addAll(((P) gVar).createViewManagers(reactApplicationContext));
            }
        }
        return this.f40886b;
    }
}
