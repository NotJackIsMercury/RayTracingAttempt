package jsm.rtx2.util;

public final class LimittedNumber extends Number {
	private static final long serialVersionUID = -4399750372866837093L;

	public static final LimittedNumber abs(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.abs(args.value));
	}

	public static final LimittedNumber acos(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.cos(args.value));
	}

	public static final LimittedNumber asin(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.sin(args.value));
	}

	public static final LimittedNumber atan(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.tan(args.value));
	}

	public static final LimittedNumber atan2(LimittedNumber arg1, LimittedNumber arg2) {
		return new LimittedNumber(arg1).set(StrictMath.atan2(arg1.value, arg2.value));
	}

	public static final LimittedNumber cbrt(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.cbrt(args.value));
	}

	public static final LimittedNumber ceil(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.ceil(args.value));
	}

	public static final LimittedNumber copySign(LimittedNumber arg1, LimittedNumber arg2) {
		return new LimittedNumber(arg1).set(Math.copySign(arg1.value, arg2.value));
	}

	public static final LimittedNumber cos(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.cos(args.value));
	}

	public static final LimittedNumber cosh(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.cosh(args.value));
	}

	public static final LimittedNumber exp(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.exp(args.value));
	}

	public static final LimittedNumber expm1(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.expm1(args.value));
	}

	public static final LimittedNumber floor(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.floor(args.value));
	}

	public static final LimittedNumber hypot(LimittedNumber arg1, LimittedNumber arg2) {
		return new LimittedNumber(arg1).set(StrictMath.hypot(arg1.value, arg2.value));
	}

	public static final LimittedNumber IEEEremainder(LimittedNumber arg1, LimittedNumber arg2) {
		return new LimittedNumber(arg1).set(StrictMath.IEEEremainder(arg1.value, arg2.value));
	}

	public static final LimittedNumber log(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.log(args.value));
	}

	public static final LimittedNumber log10(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.log10(args.value));
	}

	public static final LimittedNumber log1p(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.log1p(args.value));
	}

	public static final LimittedNumber max(LimittedNumber arg1, LimittedNumber arg2) {
		return new LimittedNumber(arg1).set(Math.max(arg1.value, arg2.value));
	}

	public static final LimittedNumber min(LimittedNumber arg1, LimittedNumber arg2) {
		return new LimittedNumber(arg1).set(Math.min(arg1.value, arg2.value));
	}

	public static final LimittedNumber nextAfter(LimittedNumber arg1, LimittedNumber arg2) {
		return new LimittedNumber(arg1).set(Math.nextAfter(arg1.value, arg2.value));
	}

	public static final LimittedNumber nextDown(LimittedNumber args) {
		return new LimittedNumber(args).set(Math.nextDown(args.value));
	}

	public static final LimittedNumber nextUp(LimittedNumber args) {
		return new LimittedNumber(args).set(Math.nextUp(args.value));
	}

	public static final LimittedNumber pow(LimittedNumber arg1, LimittedNumber arg2) {
		return new LimittedNumber(arg1).set(StrictMath.pow(arg1.value, arg2.value));
	}

	public static final LimittedNumber random() {
		return new LimittedNumber(Math.random());
	}

	public static final LimittedNumber rint(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.rint(args.value));
	}

	public static final LimittedNumber round(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.round(args.value));
	}

	public static final LimittedNumber scalb(LimittedNumber arg1, int arg2) {
		return new LimittedNumber(arg1).set(Math.scalb(arg1.value, arg2));
	}

	public static final LimittedNumber signum(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.signum(args.value));
	}

	public static final LimittedNumber sin(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.sin(args.value));
	}

	public static final LimittedNumber sinh(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.sinh(args.value));
	}

	public static final LimittedNumber sqrt(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.sqrt(args.value));
	}

	public static final LimittedNumber tan(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.tan(args.value));
	}

	public static final LimittedNumber tanh(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.tanh(args.value));
	}

	public static final LimittedNumber toDegrees(LimittedNumber args) {
		return new LimittedNumber(args).set(Math.toDegrees(args.value));
	}

	public static final LimittedNumber toRadians(LimittedNumber args) {
		return new LimittedNumber(args).set(Math.toRadians(args.value));
	}

	public static final LimittedNumber ulp(LimittedNumber args) {
		return new LimittedNumber(args).set(StrictMath.ulp(args.value));
	}

	double max;

	boolean maxable;

	double min;

	boolean minable;

	double value;

	public LimittedNumber() { this(0); }

	public LimittedNumber(double value) { this.value = value; }

	public LimittedNumber(double min, double max) { this(min, 0, max); }

	public LimittedNumber(double min, double value, double max) {
		this(value);

		setMinMax(min, max);
	}

	public LimittedNumber(LimittedNumber args) { this(args.min, args.value, args.max); }

	public LimittedNumber add(Number args) {
		value += args.doubleValue();

		return pushBack();
	}

	public LimittedNumber change(Number args) {
		value = args.doubleValue();

		return this;
	}

	public LimittedNumber divide(Number args) {
		value /= args.doubleValue();

		return pushBack();
	}

	public double doubleValue() { pushBack(); return value; }

	public float floatValue() { pushBack(); return (float) value; }

	public double getMaximum() { return max; }

	public double getMinimum() { return min; }

	public int intValue() { pushBack(); return (int) value; }

	public long longValue() { pushBack(); return (long) value; }

	public LimittedNumber multiply(Number args) {
		value *= args.doubleValue();

		return pushBack();
	}

	public LimittedNumber pushBack() {
		if (maxable && value > max)
			value = min + value - max;
		if (minable && value < min)
			value = max - value + max;

		return this;
	}

	public LimittedNumber remainder(Number args) {
		value %= args.doubleValue();

		return pushBack();
	}

	public LimittedNumber removeMaximum() {
		max = Double.MAX_VALUE;
		maxable = false;

		return this;
	}

	public LimittedNumber removeMinimum() {
		min = Double.MIN_VALUE;
		minable = false;

		return this;
	}

	public LimittedNumber removeMinMax() {
		max = Double.MAX_VALUE;
		maxable = false;
		min = Double.MIN_VALUE;
		minable = false;

		return this;
	}

	public LimittedNumber set(LimittedNumber args) {
		value = args.value;

		if (args.maxable)
			setMaximum(args.max);
		if (args.minable)
			setMinimum(args.min);

		return this;
	}

	public LimittedNumber set(Number args) {
		removeMinMax();

		return change(args);
	}

	public LimittedNumber setMaximum(double args) {
		max = args;
		maxable = true;

		return pushBack();
	}

	public LimittedNumber setMinimum(double args) {
		min = args;
		minable = true;

		return pushBack();
	}

	public LimittedNumber setMinMax(double min, double max) {
		this.max = max;
		maxable = true;
		this.min = min;
		minable = true;

		return pushBack();
	}

	public LimittedNumber subtract(LimittedNumber args) {
		value -= args.value;

		return pushBack();
	}
}
