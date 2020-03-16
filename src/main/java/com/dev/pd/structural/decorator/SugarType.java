package com.dev.pd.structural.decorator;

public enum SugarType {
	
	WHITE {
		@Override
		public float getCost() {
			return new Float(0.3);
		}
		
		@Override
		public String getDescription() {
			return "whit sugar white";
		}
	},
	BRUNETTE {
		@Override
		public float getCost() {
			return new Float(0.4);
		}
		
		@Override
		public String getDescription() {
			return "whit sugar brunette";
		}
	},
	SWEETENER {
		@Override
		public float getCost() {
			return new Float(0.6);
		}
		
		@Override
		public String getDescription() {
			return "whit sweetener";
		}
	};
	
	public abstract float getCost();
	
	public abstract String getDescription();
}
