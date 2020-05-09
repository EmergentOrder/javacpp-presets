// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** The world class manages all physics entities, dynamic simulation,
 *  and asynchronous queries. The world also contains efficient memory
 *  management facilities. */
@NoOffset @Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2World extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2World(Pointer p) { super(p); }

	/** Construct a world object.
	 *  @param gravity the world gravity vector. */
	public b2World(@Const @ByRef b2Vec2 gravity) { super((Pointer)null); allocate(gravity); }
	private native void allocate(@Const @ByRef b2Vec2 gravity);

	/** Destruct the world. All physics entities are destroyed and all heap memory is released. */

	/** Register a destruction listener. The listener is owned by you and must
	 *  remain in scope. */
	public native void SetDestructionListener(b2DestructionListener listener);

	/** Register a contact filter to provide specific control over collision.
	 *  Otherwise the default filter is used (b2_defaultFilter). The listener is
	 *  owned by you and must remain in scope. */
	public native void SetContactFilter(b2ContactFilter filter);

	/** Register a contact event listener. The listener is owned by you and must
	 *  remain in scope. */
	public native void SetContactListener(b2ContactListener listener);

	/** Register a routine for debug drawing. The debug draw functions are called
	 *  inside with b2World::DrawDebugData method. The debug draw object is owned
	 *  by you and must remain in scope. */
	public native void SetDebugDraw(b2Draw debugDraw);

	/** Create a rigid body given a definition. No reference to the definition
	 *  is retained.
	 *  \warning This function is locked during callbacks. */
	public native b2Body CreateBody(@Const b2BodyDef def);

	/** Destroy a rigid body.
	 *  This function is locked during callbacks.
	 *  \warning This automatically deletes all associated shapes and joints.
	 *  \warning This function is locked during callbacks. */
	public native void DestroyBody(b2Body body);

	/** Create a joint to constrain bodies together. No reference to the definition
	 *  is retained. This may cause the connected bodies to cease colliding.
	 *  \warning This function is locked during callbacks. */
	public native b2Joint CreateJoint(@Const b2JointDef def);

	/** Destroy a joint. This may cause the connected bodies to begin colliding.
	 *  \warning This function is locked during callbacks. */
	public native void DestroyJoint(b2Joint joint);

	/** Create a particle system given a definition. No reference to the
	 *  definition is retained.
	 *  \warning This function is locked during callbacks. */
	public native b2ParticleSystem CreateParticleSystem(@Const b2ParticleSystemDef def);

	/** Destroy a particle system.
	 *  \warning This function is locked during callbacks. */
	public native void DestroyParticleSystem(b2ParticleSystem p);

	/** Take a time step. This performs collision detection, integration,
	 *  and constraint solution.
	 *  For the numerical stability of particles, minimize the following
	 *  dimensionless gravity acceleration:
	 *      gravity / particleRadius * (timeStep / particleIterations)^2
	 *  b2CalculateParticleIterations() or
	 *  CalculateReasonableParticleIterations() help to determine the optimal
	 *  particleIterations.
	 *  @param timeStep the amount of time to simulate, this should not vary.
	 *  @param velocityIterations for the velocity constraint solver.
	 *  @param positionIterations for the position constraint solver.
	 *  @param particleIterations for the particle simulation. */
	public native void Step(	@Cast("float32") float timeStep,
					@Cast("int32") int velocityIterations,
					@Cast("int32") int positionIterations,
					@Cast("int32") int particleIterations);

	/** Take a time step. This performs collision detection, integration,
	 *  and constraint solution.
	 *  @param timeStep the amount of time to simulate, this should not vary.
	 *  @param velocityIterations for the velocity constraint solver.
	 *  @param positionIterations for the position constraint solver. */
	public native void Step(	@Cast("float32") float timeStep,
					@Cast("int32") int velocityIterations,
					@Cast("int32") int positionIterations);

	/** Recommend a value to be used in {@code Step} for {@code particleIterations}.
	 *  This calculation is necessarily a simplification and should only be
	 *  used as a starting point. Please see "Particle Iterations" in the
	 *  Programmer's Guide for details.
	 *  @param timeStep is the value to be passed into {@code Step}. */
	public native int CalculateReasonableParticleIterations(@Cast("float32") float timeStep);

	/** Manually clear the force buffer on all bodies. By default, forces are cleared automatically
	 *  after each call to Step. The default behavior is modified by calling SetAutoClearForces.
	 *  The purpose of this function is to support sub-stepping. Sub-stepping is often used to maintain
	 *  a fixed sized time step under a variable frame-rate.
	 *  When you perform sub-stepping you will disable auto clearing of forces and instead call
	 *  ClearForces after all sub-steps are complete in one pass of your game loop.
	 *  @see SetAutoClearForces */
	public native void ClearForces();

	/** Call this to draw shapes and other debug draw data. This is intentionally non-const. */
	public native void DrawDebugData();

	/** Query the world for all fixtures that potentially overlap the
	 *  provided AABB.
	 *  @param callback a user implemented callback class.
	 *  @param aabb the query box. */
	public native void QueryAABB(b2QueryCallback callback, @Const @ByRef b2AABB aabb);

	/** Query the world for all fixtures that potentially overlap the
	 *  provided shape's AABB. Calls QueryAABB internally.
	 *  @param callback a user implemented callback class.
	 *  @param shape the query shape
	 *  @param xf the transform of the AABB */
	public native void QueryShapeAABB(b2QueryCallback callback, @Const @ByRef b2Shape shape,
		                    @Const @ByRef b2Transform xf);

	/** Ray-cast the world for all fixtures in the path of the ray. Your callback
	 *  controls whether you get the closest point, any point, or n-points.
	 *  The ray-cast ignores shapes that contain the starting point.
	 *  @param callback a user implemented callback class.
	 *  @param point1 the ray starting point
	 *  @param point2 the ray ending point */
	public native void RayCast(b2RayCastCallback callback, @Const @ByRef b2Vec2 point1, @Const @ByRef b2Vec2 point2);

	/** Get the world body list. With the returned body, use b2Body::GetNext to get
	 *  the next body in the world list. A NULL body indicates the end of the list.
	 *  @return the head of the world body list. */
	public native b2Body GetBodyList();

	/** Get the world joint list. With the returned joint, use b2Joint::GetNext to get
	 *  the next joint in the world list. A NULL joint indicates the end of the list.
	 *  @return the head of the world joint list. */
	public native b2Joint GetJointList();

	/** Get the world particle-system list. With the returned body, use
	 *  b2ParticleSystem::GetNext to get the next particle-system in the world
	 *  list. A NULL particle-system indicates the end of the list.
	 *  @return the head of the world particle-system list. */
	public native b2ParticleSystem GetParticleSystemList();

	/** Get the world contact list. With the returned contact, use b2Contact::GetNext to get
	 *  the next contact in the world list. A NULL contact indicates the end of the list.
	 *  @return the head of the world contact list.
	 *  \warning contacts are created and destroyed in the middle of a time step.
	 *  Use b2ContactListener to avoid missing contacts. */
	public native b2Contact GetContactList();

	/** Enable/disable sleep. */
	public native void SetAllowSleeping(@Cast("bool") boolean flag);
	public native @Cast("bool") boolean GetAllowSleeping();

	/** Enable/disable warm starting. For testing. */
	public native void SetWarmStarting(@Cast("bool") boolean flag);
	public native @Cast("bool") boolean GetWarmStarting();

	/** Enable/disable continuous physics. For testing. */
	public native void SetContinuousPhysics(@Cast("bool") boolean flag);
	public native @Cast("bool") boolean GetContinuousPhysics();

	/** Enable/disable single stepped continuous physics. For testing. */
	public native void SetSubStepping(@Cast("bool") boolean flag);
	public native @Cast("bool") boolean GetSubStepping();

	/** Get the number of broad-phase proxies. */
	public native @Cast("int32") int GetProxyCount();

	/** Get the number of bodies. */
	public native @Cast("int32") int GetBodyCount();

	/** Get the number of joints. */
	public native @Cast("int32") int GetJointCount();

	/** Get the number of contacts (each may have 0 or more contact points). */
	public native @Cast("int32") int GetContactCount();

	/** Get the height of the dynamic tree. */
	public native @Cast("int32") int GetTreeHeight();

	/** Get the balance of the dynamic tree. */
	public native @Cast("int32") int GetTreeBalance();

	/** Get the quality metric of the dynamic tree. The smaller the better.
	 *  The minimum is 1. */
	public native @Cast("float32") float GetTreeQuality();

	/** Change the global gravity vector. */
	public native void SetGravity(@Const @ByRef b2Vec2 gravity);

	/** Get the global gravity vector. */
	public native @ByVal b2Vec2 GetGravity();

	/** Is the world locked (in the middle of a time step). */
	public native @Cast("bool") boolean IsLocked();

	/** Set flag to control automatic clearing of forces after each time step. */
	public native void SetAutoClearForces(@Cast("bool") boolean flag);

	/** Get the flag that controls automatic clearing of forces after each time step. */
	public native @Cast("bool") boolean GetAutoClearForces();

	/** Shift the world origin. Useful for large worlds.
	 *  The body shift formula is: position -= newOrigin
	 *  @param newOrigin the new origin with respect to the old origin */
	public native void ShiftOrigin(@Const @ByRef b2Vec2 newOrigin);

	/** Get the contact manager for testing. */
	public native @Const @ByRef b2ContactManager GetContactManager();

	/** Get the current profile. */
	public native @Const @ByRef b2Profile GetProfile();

	/** Dump the world into the log file.
	 *  \warning this should be called outside of a time step. */
	public native void Dump();

	/** Get API version. */
	public native @Const b2Version GetVersion();

	/** Get API version string. */
	public native @Cast("const char*") BytePointer GetVersionString();
	/** Constructor which takes direct floats. */
	public b2World(@Cast("float32") float gravityX, @Cast("float32") float gravityY) { super((Pointer)null); allocate(gravityX, gravityY); }
	private native void allocate(@Cast("float32") float gravityX, @Cast("float32") float gravityY);

	/** Set gravity with direct floats. */
	public native void SetGravity(@Cast("float32") float gravityX, @Cast("float32") float gravityY);
}
