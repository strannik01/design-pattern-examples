package com.dev.pd.structural.decorator;

public enum SpiceType {
	
	STAR_ANIS {
		@Override
		public float getCost() {
			return new Float(0.4);
		}
		
		@Override
		public String getDescription() {
			return "whit star anis";
		}
	},
	SAFFRON {
		@Override
		public float getCost() {
			return new Float(0.6);
		}
		
		@Override
		public String getDescription() {
			return "whit saffron";
		}
	},
	CINNAMON {
		@Override
		public float getCost() {
			return new Float(0.3);
		}
		
		@Override
		public String getDescription() {
			return "whit cinnamon";
		}
	},
	VANILLA {
		@Override
		public float getCost() {
			return new Float(0.4);
		}
		
		@Override
		public String getDescription() {
			return "whit vanilla";
		}
	};
	
	public abstract float getCost();
	
	public abstract String getDescription();

}
