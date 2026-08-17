package Y0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f16794a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f16795b;

    public interface a {
        Intent f();
    }

    private w(Context context) {
        this.f16795b = context;
    }

    public static w g(Context context) {
        return new w(context);
    }

    public w a(Intent intent) {
        this.f16794a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w c(Activity activity) {
        Intent intentF = activity instanceof a ? ((a) activity).f() : null;
        if (intentF == null) {
            intentF = j.a(activity);
        }
        if (intentF != null) {
            ComponentName component = intentF.getComponent();
            if (component == null) {
                component = intentF.resolveActivity(this.f16795b.getPackageManager());
            }
            e(component);
            a(intentF);
        }
        return this;
    }

    public w e(ComponentName componentName) {
        int size = this.f16794a.size();
        try {
            Intent intentB = j.b(this.f16795b, componentName);
            while (intentB != null) {
                this.f16794a.add(size, intentB);
                intentB = j.b(this.f16795b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void h() {
        i(null);
    }

    public void i(Bundle bundle) {
        if (this.f16794a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f16794a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (Z0.b.n(this.f16795b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f16795b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f16794a.iterator();
    }
}
