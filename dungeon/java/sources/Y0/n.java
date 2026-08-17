package Y0;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f16753a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f16754b = new Object();

    static Bundle a(l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(u uVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", uVar.n());
        bundle.putCharSequence("label", uVar.m());
        bundle.putCharSequenceArray("choices", uVar.g());
        bundle.putBoolean("allowFreeFormInput", uVar.e());
        bundle.putBundle("extras", uVar.l());
        Set setF = uVar.f();
        if (setF != null && !setF.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setF.size());
            Iterator it = setF.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[uVarArr.length];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            bundleArr[i10] = b(uVarArr[i10]);
        }
        return bundleArr;
    }
}
