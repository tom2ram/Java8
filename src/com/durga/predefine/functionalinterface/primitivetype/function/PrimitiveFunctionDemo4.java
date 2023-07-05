package com.durga.predefine.functionalinterface.primitivetype.function;

//All 15 Primitve Type Functional Interfaces for Function
public class PrimitiveFunctionDemo4
{
	public static void main(String[] args)
	{
		//1) Input is int and return type is anything then we should go for IntFunction<R>
		/*IntFunction<R>{
			R apply(int value);
		}*/
		
		//2) Input is long and return type is anything then we should go for LongFunction<R>
				/*LongFunction<R>{
					R apply(long value);
				}*/
		
		//3) Input is double and return type is anything then we should go for DoublleFunction<R>
		/*DoublleFunction<R>{
			R apply(double value);
		}*/
		
		//4) Input is any type and return type is int then we should go for ToIntFunction<T>
				/*ToIntFunction<T>{
					int applyAsInt(T value);
				}*/
		
		//5) Input is any type and return type is long then we should go for ToLongFunction<T>
		/*ToLongFunction<T>{
			long applyAsLong(T value);
		}*/
		
		//6) Input is any type and return type is double then we should go for ToDoubleFunction<T>
				/*ToDoubleFunction<T>{
					double applyAsDouble(T value);
				}*/
		
		//7) Input is int and return type is long then we should go for IntToLongFunction
		/*IntToLongFunction{
			long applyAsLong(int value);
		}*/
		
		//8) Input is int and return type is double then we should go for IntToDoubleFunction
				/*IntToDoubleFunction{
					double applyAsDouble(int value);
				}*/
		
		//9) Input is long and return type is int then we should go for LongToIntFunction
				/*IntToLongFunction{
					int applyAsInt(long value);
				}*/
				
		//10) Input is long and return type is double then we should go for LongToDoubleFunction
			/*LongToDoubleFunction{
							double applyAsDouble(long value);
						}*/
		
		//11) Input is double and return type is int then we should go for DoubleToIntFunction
		/*DoubleToIntFunction{
			int applyAsInt(double value);
		}*/
		
		//12) Input is double and return type is long then we should go for DoubleToLongFunction
				/*DoubleToLongFunction{
					long applyAsLong(double value);
				}*/
		
		//13) Input is any type and return type is int then we should go for ToIntBiFunction
		/*ToIntBiFunction<T, U>{
			int applyAsInt(T t, U u);
		}*/
		
		//14) Input is any type and return type is long then we should go for ToLongBiFunction
				/*ToLongBiFunction<T, U>{
					long applyAsLong(T t, U u);
				}*/
		
		//15) Input is any type and return type is double then we should go for ToDoubleBiFunction
				/*ToDoubleBiFunction<T, U>{
					double applyAsDouble(T t, U u);
				}*/
		
	}
}
