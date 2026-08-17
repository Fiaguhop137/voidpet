package p338se;

import kotlin.jvm.internal.Intrinsics;
import p302qe.g;
import p410we.c;
import p464ze.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static final x a(v vVar, g javaClass, c metadataVersion) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        v.a aVarC = vVar.c(javaClass, metadataVersion);
        if (aVarC != null) {
            return aVarC.a();
        }
        return null;
    }

    public static final x b(v vVar, b classId, c metadataVersion) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        v.a aVarB = vVar.b(classId, metadataVersion);
        if (aVarB != null) {
            return aVarB.a();
        }
        return null;
    }
}
