package Fd;

import Ad.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    public static final class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f3058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3059c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ed.b bVar, Function2 function2, Object obj) {
            super(bVar);
            this.f3058b = function2;
            this.f3059c = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f3057a;
            if (i10 == 0) {
                this.f3057a = 1;
                r.b(obj);
                Intrinsics.d(this.f3058b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) K.e(this.f3058b, 2)).invoke(this.f3059c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3057a = 2;
            r.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f3061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ed.b bVar, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(bVar, coroutineContext);
            this.f3061b = function2;
            this.f3062c = obj;
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f3060a;
            if (i10 == 0) {
                this.f3060a = 1;
                r.b(obj);
                Intrinsics.d(this.f3061b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) K.e(this.f3061b, 2)).invoke(this.f3062c, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f3060a = 2;
            r.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: Fd.c$c, reason: collision with other inner class name */
    public static final class C0062c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0062c(Ed.b bVar) {
            super(bVar);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            r.b(obj);
            return obj;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ed.b bVar, CoroutineContext coroutineContext) {
            super(bVar, coroutineContext);
            Intrinsics.d(bVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            r.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Ed.b a(Function2 function2, Object obj, Ed.b completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Ed.b bVarA = h.a(completion);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(obj, bVarA);
        }
        CoroutineContext context = bVarA.getContext();
        return context == e.f48283a ? new a(bVarA, function2, obj) : new b(bVarA, context, function2, obj);
    }

    private static final Ed.b b(Ed.b bVar) {
        CoroutineContext context = bVar.getContext();
        return context == e.f48283a ? new C0062c(bVar) : new d(bVar, context);
    }

    public static Ed.b c(Ed.b bVar) {
        Ed.b bVarIntercepted;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = bVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) bVar : null;
        return (dVar == null || (bVarIntercepted = dVar.intercepted()) == null) ? bVar : bVarIntercepted;
    }

    public static Object d(Function2 function2, Object obj, Ed.b completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return ((Function2) K.e(function2, 2)).invoke(obj, b(h.a(completion)));
    }
}
