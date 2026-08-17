package androidx.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f25665b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f25664a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f25666c = new ArrayList();

    public v(View view) {
        this.f25665b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f25665b == vVar.f25665b && this.f25664a.equals(vVar.f25664a);
    }

    public int hashCode() {
        return (this.f25665b.hashCode() * 31) + this.f25664a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f25665b + "\n") + "    values:";
        for (String str2 : this.f25664a.keySet()) {
            str = str + "    " + str2 + ": " + this.f25664a.get(str2) + "\n";
        }
        return str;
    }
}
